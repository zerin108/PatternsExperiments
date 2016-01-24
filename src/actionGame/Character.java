package actionGame;

/**
 *
 * @author Lama
 */
public abstract class Character {
    WeaponBehavior weapon;
    
    public Character(){
        
    }
    
    public void fight(){
        
    };

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

}
