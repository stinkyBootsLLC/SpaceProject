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
    
    // declare variables
    public int rocketCost;  
    public float rocketWeight; 
    public float cargoMaxWeight;
    public float totalWeightLimit;
    public double chanceOfLandingCrash;
    public double chanceOfLaunchExplosion; 
    
    public Rocket() {
        rocketCost = 0;  
        rocketWeight = 0f; 
        cargoMaxWeight = 0f;  
        totalWeightLimit = 0f;
        chanceOfLandingCrash = 0;
        chanceOfLaunchExplosion = 0;
    }// default constructor
    
    
    /**
     * launch and land methods in the Rocket class should always return true
     * @return 
     */
    @Override
    public boolean launch() {
        return true;
    }// end launch()
    /**
     * launch and land methods in the Rocket class should always return true
     * @return 
     */
    @Override
    public boolean land() {
        return true;
    }// end land()

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
    
    
    // have to load up the rocket and calculate the total weight
    public void setTotalWeight(){
        
    }// end setTotalWeight

    public int getRocketCost() {
        return rocketCost;
    }

    public float getRocketWeight() {
        return rocketWeight;
    }

    public float getCargoMaxWeight() {
        return cargoMaxWeight;
    }

    public float getTotalWeightLimit() {
        return totalWeightLimit;
    }

    public double getChanceOfLandingCrash() {
        return chanceOfLandingCrash;
    }

    public double getChanceOfLaunchExplosion() {
        return chanceOfLaunchExplosion;
    }
    
    
    

    @Override
    public String toString() {
        return "rocketCost=" + rocketCost + ", \nrocketWeight=" 
                + rocketWeight + ", \ncargoMaxWeight=" + cargoMaxWeight 
                + ", \ntotalWeightLimit=" + totalWeightLimit 
                + ", \nchanceOfLandingCrash=" + chanceOfLandingCrash 
                + ", \nchanceOfLaunchExplosion=" + chanceOfLaunchExplosion + "\n";
    }// end toString()
    
    
    
}// end SpaceShip
