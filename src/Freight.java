import java.util.ArrayList;

public class Freight {
    private int id;
    private String name;
    private ArrayList<Warehouse>sites = new ArrayList<>();
    private ArrayList<Product>item = new ArrayList<>();
    public Freight() {
    }

    public Freight(int id, ArrayList<Product> item) {
        this.id = id;
        this.item = item;
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

    public ArrayList<Warehouse> getSites() {
        return sites;
    }

    public void setSites(ArrayList<Warehouse> sites) {
        this.sites = sites;
    }

    public ArrayList<Product> getItem() {
        return item;
    }

    public void setItem(ArrayList<Product> item) {
        this.item = item;
    }
}
