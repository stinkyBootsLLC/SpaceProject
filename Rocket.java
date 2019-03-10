/*
    Create a class Rocket that implements the SpaceShip Interface and hence 
    implements all the SpaceShip methods.

    launch and land methods in the Rocket class should always return true.
    When U1 and U2 classes extend the Rocket class they will override these 
    methods to return true or false based on the actual probability of each type.
    
    carry and canCarry should be implemented here and will not need to be 
    overridden in the U1 and U2 classes
 */
package spaceproject;

/**
 *
 * @author eduardo
 */
public class Rocket implements SpaceShip{

    public Rocket() {
    }// default constructor
    
    

    @Override
    public boolean launch() {
        //launch and land methods in the Rocket class should always return true
        return true;
    }

    @Override
    public boolean land() {
        //launch and land methods in the Rocket class should always return true
        return true;
    }

    @Override
    public boolean canCarry() {
    //carry and canCarry should be implemented here and will not need to be 
    //overridden in the U1 and U2 classes
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int carry() {
    //carry and canCarry should be implemented here and will not need to be 
    //overridden in the U1 and U2 classes
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}// end SpaceShip
