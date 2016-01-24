package patternsexperiments.ducks;

/**
 *
 * @author Lama
 */
public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("QUACK");
    }

}
