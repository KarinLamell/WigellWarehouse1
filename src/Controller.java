import java.util.Scanner;

public class Controller {

    int productId = 1;
    int itemId = 1;
    Warehouse warehouse = new Warehouse();
    Freight freight = new Freight();

    private Scanner scanner = new Scanner(System.in);

    private void createProduct(){
        System.out.println("Ange produktnamn");
        String name = scanner.nextLine();
        System.out.println("Ange pris");
        double price = scanner.nextDouble();
        Product product = new Product(productId,name,price);
        warehouse.getAssortment().add(product);
        productId++;
    }
    private void showAssortment(){
        System.out.println("Aktuellt sortiment");
        for (Product p:warehouse.getAssortment() ){
            System.out.println(p.getProductId()+" " + p.getName()+" " + p.getPrice());
        }

    }




    private void receiveItem(){
        System.out.println("Ange försändelsens ID");
        int itemId = scanner.nextInt();


           }

    private void createItem(){
        System.out.println("Ange produktID");
        int productId = scanner.nextInt();
        System.out.println("Ange antal");
        int number = scanner.nextInt();
        freight.getItem().add(new Product(productId,number));
        itemId++;

    }


    public void stockManagement(){
        String string = "7";
        while (string != "9"){
        System.out.println("Välkommen, vad vill du göra?");
            System.out.println("Skapa ny produkt: 1");
            System.out.println("Ta emot försändelse (lägg in i lager): 2");
            System.out.println("Skapa försändelse (ta ur lager, koppla till bil): 3");
            System.out.println("Visa sortiment: 4");
            System.out.println("Avsluta: 9");
            System.out.print("Ditt val: ");
          string = scanner.nextLine();


        switch(string){
            case "1": //Skapa ny produkt
                createProduct();

                break;


            case "2":

            createItem();
                break;

            case "3":



                break;
            case "4":

                showAssortment();

                break;

            case "9": break;



        }
    }}


}
