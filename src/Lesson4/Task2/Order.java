package src.Lesson4.Task2;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private static int count = 0;
    private int id;
    private  int ordPrice;
    private Costumer costumer;
    private Map<Product, Integer> productsOrdered = new HashMap<>();

    public Order(Costumer costumer) {
        this.id = count++;
        this.costumer = costumer;
    }

    public void addProduct(Product product, int quantity) {
        productsOrdered.put(product, quantity);
        calculateOrdPrice(product,quantity);

    }

    public int getOrdPrice() {
        return ordPrice;
    }

    public void calculateOrdPrice(Product product, int quantity) {
        this.ordPrice =  product.getPrice() * quantity;
    }
    public void setOrdPrice(int ordPrice) {
        this.ordPrice = ordPrice;
    }

    public int getId() {
        return id;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }

    public Map<Product, Integer> getProductsOrdered() {
        return productsOrdered;
    }

    public void setProductsOrdered(Map<Product, Integer> productsOrdered) {
        this.productsOrdered = productsOrdered;
    }

    @Override
    public String toString() {
        return "\t" + "Order{" + "id: " + id +
                ", costumer=" + costumer +
                ", products=" + productsOrdered +
                ", TotalPrice=" + ordPrice +
                '}' + "\n";
    }
}
