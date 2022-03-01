package carrot.model;

public class Item {
    private String id;
    private String name;
    private int point;
    private int stock;
    private int sold;

    public Item() {
    }

    public Item(String id, String name, int point, int stock, int sold) {
        this.id = id;
        this.name = name;
        this.point = point;
        this.stock = stock;
        this.sold = sold;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", point=" + point +
                ", stock=" + stock +
                '}';
    }
}
