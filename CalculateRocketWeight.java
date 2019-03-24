/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceproject;

import java.util.*;

/**
 *
 * @author eduardo
 */
public class CalculateRocketWeight {
    
    public static int totalU1CargoWeight; // all items
    public static int cargoItemloaded; // all items
    
    ArrayList u1RocketsList = new ArrayList<>();

    public CalculateRocketWeight() {
    }// end default const
    
    public boolean calculate_U1_CargoWeight(Item cargo){
        // the parameter is the instance of the class 
        //Item, no need to do it again
        
        boolean isFull = false;
        
    
        
        // 907.185 kg =  1 Ton
        // MAX weight = 18 tonnes of cargo = 16,329.33 kg
        float cargoMaxWeight = 16329.33f;
        
        //int itemWeight = item.getWeight();
        
       // u1TotalWeight = itemWeight;
        
        
        // bring in the Item
        String cargoName = cargo.getName();
        // add the weight
        totalU1CargoWeight += cargo.getWeight();
       // System.out.println(totalCargoWeight);
        
        if (totalU1CargoWeight < cargoMaxWeight) {
            System.out.println(cargoName + " good load");
            System.out.println("TOTAL U1 CARGO WEIGHT = " + totalU1CargoWeight );
            isFull = false;
            cargoItemloaded++;
            
        } else if (totalU1CargoWeight >= cargoMaxWeight){
            // the rocket is full, but the last item checked is NEVER loaded
            // needs to be else if exceeds the cargo weight limit 
            // take this extra item and load it on the next rocket
            System.out.println("cargo NOT loaded = " + cargoName + " - with a weight of " + cargo.getWeight() );
            // subtract the last item that will not fit from the total loaded weight
            totalU1CargoWeight -= cargo.getWeight();
            // create a U1 rocket object
            u1RocketsList.add(CalculateRocketWeight.totalU1CargoWeight);
            //U1 u1Rocket = new U1(CalculateRocketWeight.totalU1CargoWeight);
            //System.out.println(u1Rocket.toString());
            isFull = true;
            
            
            // build the object array list of Item objects
            //u1RocketsList.add( new Item(name, weight));
            System.out.println(u1RocketsList.toString());
            
            
            
            
          
            // reset the total
            totalU1CargoWeight=0;
        }// end if 
       // System.out.println("total U1 rockets = " + numberOfU1Rockets);
        // this should return a bool once the rocket is full 
        // and launch the rocket
        return isFull;
        
        
        
        
        
    }// end calculate_U1_CargoWeight
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}// end class CalculateRocketWeight
