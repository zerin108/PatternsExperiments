package pizza;

/**
 *
 * @author Lama
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        
        //сначала создаем два объекта пиццерий
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        
        //используем один для выполнения заказа
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        
        
    }
}
