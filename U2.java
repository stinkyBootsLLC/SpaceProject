/*
    Create classes U1 and U2 that extend the Rocket class and override the land 
    and launch methods to calculate the corresponding chance of exploding and 
    return either true or false based on a random number using the probability 
    equation for each. 

    U-2
    The U2 Rocket heavier than the U-1 but much safer and can carry a lot more 
    cargo; to a total of 29 tonnes. However, it costs $120 Million to build and 
    weighs 18 tonnes. It has a greater chance of crashing while landing than while 
    launching, but just like the U-1 both chances depend on the amount of cargo 
    carried.









*/
package spaceproject;

/**
 *
 * @author eduardo
 */
public class U2 extends Rocket{
    
    public static int totalWeight;

    public U2() {
    }// default constructor
    
     @Override
    public boolean launch() {
    /*
    override the land 
    and launch methods to calculate the corresponding chance of exploding and 
    return either true or false based on a random number using the probability 
    equation for each. 
        
    */
        return true;
        
        
    }// end launch
    
    
    @Override
    public boolean land() {
    /*
    override the land 
    and launch methods to calculate the corresponding chance of exploding and 
    return either true or false based on a random number using the probability 
    equation for each. 
        
    */
        return true;
    }// end land

    @Override
    public int getRocketCost() {
        return rocketCost;
    }

    @Override
    public float getRocketWeight() {
        return rocketWeight;
    }

    @Override
    public float getCargoMaxWeight() {
        return cargoMaxWeight;
    }

    @Override
    public float getTotalWeightLimit() {
        return totalWeightLimit;
    }

    @Override
    public double getChanceOfLandingCrash() {
        return chanceOfLandingCrash;
    }

    @Override
    public double getChanceOfLaunchExplosion() {
        return chanceOfLaunchExplosion;
    }
    
    

    
    
}// end class
