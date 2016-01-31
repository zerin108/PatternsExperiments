package pizza;

/**
 *
 * @author Lama
 */
public abstract class PizzaStore {
    
    public Pizza orderPizza(String type){
        Pizza pizza;
        
        pizza = createPizza(type);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
    
    //абстарктный фабричный метод. Вся ответственность по созданию экземпляров Pizza здесь
    abstract Pizza createPizza(String type);

}
