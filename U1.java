/*
    Create classes U1 and U2 that extend the Rocket class and override the land 
    and launch methods to calculate the corresponding chance of exploding and 
    return either true or false based on a random number using the probability 
    equation for each. 

    U-1
    The U-1 Rocket is light weight, agile and pretty safe, but can only carry 
    a total of 18 tonnes of cargo. It costs $100 Million to build and weighs 
    10 tonnes. It has a slim chance of crashing while landing but a bigger chance 
    of exploding when launching, both chances depend on the amount of cargo carried 
    in the rocket.


*/
package spaceproject;

/**
 *
 * @author eduardo
 */
public class U1 extends Rocket{
    // declare variables

    public static int U1_totalWeight;// cargo + rocket
    public static int totalCargoWeight; // all items

    public U1() {
        super.rocketCost = 100000000;  // It costs $100 Million to build
        super.rocketWeight = 9071.85f; // weighs 10 tonnes
        super.cargoMaxWeight = 16329.33f;  // = 18 tonnes of cargo = 16,329.33 kg
        super.totalWeightLimit = rocketWeight + cargoMaxWeight;
        super.chanceOfLandingCrash = 0;// It has a slim chance of crashing while landing 
        super.chanceOfLaunchExplosion = 0; // but a bigger chance of exploding when launching
    }// default constructor
    
    
    
    @Override
    public boolean launch() {
    /*
    override the land 
    and launch methods to calculate the corresponding chance of exploding and 
    return either true or false based on a random number using the probability 
    equation for each. 
        
        but can only carry 
    a total of 18 tonnes of cargo
        
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
        System.out.println("LAUNCH");
        return true;
    }// end land
    
    // have to load up the rocket and calculate the total weight

    public void calculateCargoWeight(Item cargo){
        
       // Item item = new Item();
        
        // 907.185 kg =  1 Ton
        // MAX weight = 18 tonnes of cargo = 16,329.33 kg
        
        //int itemWeight = item.getWeight();
        
       // u1TotalWeight = itemWeight;
        
        
        // bring in the Item
        String cargoName = cargo.getName();
        // add the weight
        totalCargoWeight += cargo.getWeight();
       // System.out.println(totalCargoWeight);
        
        if (totalCargoWeight < cargoMaxWeight) {
            System.out.println(cargoName + " good load");
            System.out.println("TOTAL CARGO WEIGHT = " + totalCargoWeight );
            
        } else {
            // once this fills up  / we need a new rocket
           // boolean canWeLaunch = launch();
           // System.out.println(canWeLaunch);
            
            System.out.println(totalCargoWeight + " Cargo -" + cargoName 
                    + " Weight exeeds (" + cargoMaxWeight + " max load)");
            // reset the total
            totalCargoWeight=0;
        }// end if 
        
        // this should return a bool once the rocket is full 
        // and launch the rocket
        
        
        
        
        
    }// end calculateCargoWeight

    @Override
    public String toString() {
        return "U1 rocket \n"+super.toString() + "totalWeightLimit = " 
                + totalWeightLimit;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}// end class
