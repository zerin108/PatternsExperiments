package patternsexperiments.ducks;

/**
 *
 * @author Lama
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MarralDuck();
        mallard.performFly();
        mallard.performQuack();
        
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new  FlyRocketPowered());
        model.performQuack();
        model.performFly();
    }

}
