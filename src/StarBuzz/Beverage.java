package StarBuzz;

/**
 *
 * @author Lama
 */
public abstract class Beverage {
    String description = "Unknown Beverage";
    
    public String getDescription(){//уже реализован
        return  description;
    }
    
    public abstract double cost();//необходимо реализовать в субклассах

}
