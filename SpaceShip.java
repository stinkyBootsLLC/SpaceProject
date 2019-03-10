/*
    Create a SpaceShip Interface that includes the definitions of these methods:

    launch: a method that returns either true or false indicating if the launch 
        was successful or if the rocket has crashed.
    land: a method that also returns either true or false based on the success 
        of the landing.
    canCarry: a method that takes an Item as an argument and returns true if 
        the rocket can carry such item or false if it will exceed the weight 
        limit.
    carry: a method that also takes an Item object and updates the current 
        weight of the rocket.

 */
package spaceproject;

/**
 *
 * @author Eduardo Estrada
 */
public interface SpaceShip {

    /**
     * a method that returns either true or false indicating if the launch was
     * successful or if the rocket has crashed.
     * @return 
     */
    boolean launch ();
  
    /**
     * a method that also returns either true or false based on the success of 
     * the landing.
     * @return 
     */
    boolean land ();

    /**
     * a method that takes an Item as an argument and returns true if the rocket
     * can carry such item or false if it will exceed the weight limit.
     * @return 
     */
    boolean canCarry(); 
    
    /**
     * a method that also takes an Item object and updates the current weight
     * of the rocket.
     * @return 
     */
    int carry(); 
    
    
    
    
    
    
    
    
}// end SpaceShip
