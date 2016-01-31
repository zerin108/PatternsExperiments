package pizza;

import pizza.chicago.ChicagoStlyleClamPizza;
import pizza.chicago.ChicagoStyleCheesePizza;
import pizza.chicago.ChicagoStyleVeggiePizza;

/**
 *
 * @author Lama
 */
public class ChicagoStylePizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();            
        } else if (type.equals("veggi")) {
            return new ChicagoStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new ChicagoStlyleClamPizza();
        }   else {
            return null;
        }
    }

}
