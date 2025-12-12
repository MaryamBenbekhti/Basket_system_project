import java.util.ArrayList;

public class Basket{
    private ArrayList<items> = new ArrayList<>();

    public void add(Item item){
        items.add(item);
        System.out.println(item.getName() + "added to your Basket ");
    }
    public void remove(String name){
        for (Item i: items){
            if(i.getName().equalsIgnoreCase(name)){
                items.remove(i);
                System.out.println(name + "has been removed");
                return;
            }
        }
        System.out.println("couldn't find that item");
    }
    public double getTotal(){
        double total = 0;
        for (Item i : items){
            total += i.getPrice();
        }
    }   return total;
    public void showBasket(){
        if (items.isEmpty()){
            System.out.println("There are no items in your Basket");
            return;
        }
        System.out.println("items in your Basket");
        for(Item i : items){
            System.out.println(i);
        }
        System.out.println("Total price is " + getTotal() + "USD");
    }
}