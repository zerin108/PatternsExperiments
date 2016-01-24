package patternsexperiments.ducks;

/**
 *
 * @author Lama
 */
public class ModelDuck extends Duck {
    
    public ModelDuck(){
        flyBehavior = new FlyNoWay(); //утка-приманка не умеет летать
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }

}
