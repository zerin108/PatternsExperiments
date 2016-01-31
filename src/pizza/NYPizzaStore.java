package pizza;

import pizza.newyorkstyle.NYStlyleClamPizza;
import pizza.newyorkstyle.NYStyleCheesePizza;
import pizza.newyorkstyle.NYStyleVeggiePizza;

/**
 *
 * @author Lama
 */
public class NYPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return  new NYStlyleClamPizza();            
        }
        else
            return null;
    }

}
