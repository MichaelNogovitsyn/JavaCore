package src.Lesson4.Task2;

import java.util.ArrayList;
import java.util.List;

public class Market {
    public List<Costumer> costumers;
    public List<Product> products;
    private List<Order> orders;

    public Market() {
        costumers = new ArrayList<>(List.of(
                new Costumer("Tom", 29, "1111", Costumer.Gen.male),
                new Costumer("Petr", 30, "2222", Costumer.Gen.male),
                new Costumer("Masha", 18, "3333", Costumer.Gen.famale),
                new Costumer("Any", 37, "4444",Costumer.Gen.famale),
                new Costumer("Michael", 38, "5555",Costumer.Gen.male),
                new Costumer(null, 38, "5555",Costumer.Gen.famale)
        ));
        products = new ArrayList<>(List.of(
                new Product("Broad", 5),
                new Product("", 3),
                new Product("Tomate", 7),
                new Product("Cola", 9),
                new Product("Milk", 2)
        ));
        orders = new ArrayList<>();


    }

    public int createOrder(Costumer costumer) throws CustomerException{
        if (costumer.getName() == null || !costumers.contains(costumer)) { throw new CustomerException(" User name is empty");}
        Order order = new Order(costumer);
        orders.add(order);
        return order.getId();
    }

    public Order addProductToOrder(int orderId, Product product, int quantity)throws ProductException , AmountException{
        if (product == null || product.getTitle().isEmpty()){ throw new ProductException(" Product not exsist");}
        if (quantity>180 | quantity <0) {throw new AmountException(" quantity Error");}
        Order order = orders.stream().filter(o -> o.getId() == orderId).findFirst().get();
        order.addProduct(product,quantity);
        return order;
    }
    public void setOrderPrice (int orderId, int newPrice)
    {
        getOrder(orderId).setOrdPrice(newPrice);
    }

    public List<Costumer> getCostumers() {
        return costumers;
    }

    public void setCostumers(List<Costumer> costumers) {
        this.costumers = costumers;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Order> getOrders() {
        return orders;
    }
    public Order getOrder(int orderId) {
        Order order = orders.stream().filter(o -> o.getId() == orderId).findFirst().get();
        return order;
    }

}

