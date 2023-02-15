import java.util.ArrayList;

public class Warehouse {
    private int id;
    private String name;

    private String address;
    private int capacity; //möjligt antal produkter

    private ArrayList<Product>assortment = new ArrayList<>();

    private ArrayList<Freight>freightCompanies = new ArrayList<>();

    public Warehouse() {
    }

    public ArrayList<Product> getAssortment() {
        return assortment;
    }

    public void setAssortment(ArrayList<Product> assortment) {
        this.assortment = assortment;
    }

    public Warehouse(int id, String name, String address, int capacity) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.capacity = capacity;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Freight> getFreightCompanies() {
        return freightCompanies;
    }

    public void setFreightCompanies(ArrayList<Freight> freightCompanies) {
        this.freightCompanies = freightCompanies;
    }
}
