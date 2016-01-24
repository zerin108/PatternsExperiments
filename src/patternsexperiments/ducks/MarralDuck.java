package patternsexperiments.ducks;

/**
 *
 * @author Lama
 */
public class MarralDuck extends Duck{
    public MarralDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
    }

   
}
