package pizza;

import java.util.ArrayList;

/**
 *
 * @author Lama
 */

//super class for all Pizza
public abstract class Pizza {
    
    public String name;
     public String dough;
    public String sauce;
    public ArrayList toppings = new ArrayList();
    
    //по умолчанию Pizza предоставляет реализацию некоторых методов
    
    //приготовление пиццы состоит из нескольких шагов в определенной последовательности
    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough ...");
        System.out.println("Adding sauce ...");
        System.out.println("Adding toppings: ");
        
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("    " + toppings.get(i));           
        }
    }
    
    
    public void bake(){
        System.out.println("Bake for 25 minutes at 350C");
    }
    
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    
    public void box(){
        System.out.println("Place pizza in offical PizzaStore Box");
    }
    
    public String getName(){
        return name;
    }

}
