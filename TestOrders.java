import java.nio.file.OpenOption;
import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Item item1 = new Item("Cappoccino",3.5);
        Item item2 = new Item("Latte",4.5);
        Item item3 = new Item("Drip Coffee",2.5);
        Item item4 = new Item("Mocha",1.5);
        
        items.add(item1);
        
        items.add(item2);
        
        items.add(item3);
        
        items.add(item4);


        // Menu items
        for(int i=0; i<items.size(); i++){
            Item item = items.get(i);
            System.out.printf("%d - %s  $ %.2f%n", i, item.name, item.price);
        }
        // Order variables -- order1, order2 etc.
        Order order1 = new Order("Cinghurl");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        // Application Simulations
        order1.items.add(items.get(0));
        order1.items.add(items.get(2));
        order1.ready=true;
        order1.total = order2.calculateTotal();
        System.out.println(order1);
        System.out.println(order1.name+"  "+order1.ready+ "  "+order1.total );
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        order2.items.add(items.get(0));
        order2.ready=true;
        order2.total = order2.calculateTotal();
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
        System.out.printf("the total for %s = %.2f\n", order2.name,order2.total);
        
        order3.items.add(items.get(0));
        order3.ready=true;
        order3.total = order2.calculateTotal();
        
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        
        order4.items.add(items.get(0));
        order4.items.add(items.get(1));
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
        order4.ready=true;
        order4.total = order2.calculateTotal();
        order4.items.add(items.get(1));
        order4.items.add(items.get(1));
        order4.ready=true;
        order4.total = order2.calculateTotal();
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}
