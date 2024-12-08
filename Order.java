import java.util.ArrayList;
public class Order {
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items = new ArrayList<>();

    public Order(String name){
        this.name = name;
    }
    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.price;
        }
        return total;
    }
}
