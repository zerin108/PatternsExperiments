package StarBuzz;

/**
 *
 * @author Lama
 */
public class Espresso extends Beverage{
    public Espresso(){
        description = "Espresso";   //описание задается в конструкторе класса. Переменная description наследуется от Beverage
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
