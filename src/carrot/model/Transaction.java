package carrot.model;

import java.util.Date;

public class Transaction {
    private String id;
    private Item item;
    private Date date;
    private int quantity;

    public Transaction() {
    }

    public Transaction(String id, Item item, Date date, int quantity) {
        this.id = id;
        this.item = item;
        this.date = date;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", item=" + item +
                ", date=" + date +
                ", quantity=" + quantity +
                '}';
    }
}
