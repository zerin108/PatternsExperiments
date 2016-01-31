package pizza.newyorkstyle;

import pizza.Pizza;

/**
 *
 * @author Lama
 */
public class NYStyleCheesePizza extends Pizza{
    
    //нью-йоркская пицца готовится с соусом маринаром на тонкой основе
    public NYStyleCheesePizza(){
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        
        //Одна добавка: сыр "реджано"
        toppings.add("Gratted Reggiano Cheese");
        
    }

}
