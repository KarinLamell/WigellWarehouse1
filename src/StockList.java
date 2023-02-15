import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class StockList {
    private HashMap<String, String> config = new HashMap<>();
    private final File filepath = new File("src/Lagersaldo.txt");
    private static StockList stockList;

    private StockList() throws IOException {  //Skapar constructor

        List<String> lines = Files.readAllLines(Paths.get(String.valueOf(filepath)));
        for (String line : lines) {
            String[] parts = line.split(":"); //Delar upp raden vid :
            config.put(parts[0], parts[1]);  //key går in som parts 0 = product-id, value går in som parts 1

            //config är hashmappen som skapades längst upp
        }
    }


    public static StockList getStockList(){   //nyckeln/kärnan i singletonmönstret
        if (stockList == null) {
            try {
                stockList = new StockList();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        return stockList;
    }
    private void saveStockList(){
        String stockData = "";
        for (String key : config.keySet()){
            stockData += key + ":" + config.get(key) + "\n"; //för varje key hämta key + value, lägg in i configData
        }
        try{
            FileWriter fileWriter = new FileWriter((new File(String.valueOf(filepath))), false);
            fileWriter.write(stockData);
            fileWriter.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public void save(String key, String value) {
        config.put(key, value);
        saveStockList();
    }

    public String read(String key){
        if(config.keySet().contains(key)){
            return config.get(key);
        }
        return "Key not found";
    }
}
