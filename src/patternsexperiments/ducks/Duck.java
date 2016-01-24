package patternsexperiments.ducks;

/**
 *
 * @author Lama
 */
public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    
    public Duck(){
        
    }
    
    public abstract void display();
    
    public void performFly(){
        flyBehavior.fly();
    }
    
    public void performQuack(){
        quackBehavior.quack();
    }
    
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
    
    public void setFlyBehavior(FlyBehavior fl){
        flyBehavior = fl;
    }

}
