package pizza.chicago;

import pizza.Pizza;

/**
 *
 * @author Lama
 */
public class ChicagoStyleCheesePizza extends Pizza{
    
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra thig crust dough";
        sauce = "Plum Tomato Souce";
        
        toppings.add("Chredded Mozarella Cheese");
        
    }
    
    @Override
    public void cut(){
        System.out.println("Cutting pizza into square slices");
    }

}
