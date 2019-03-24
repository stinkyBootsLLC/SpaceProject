/*
    Create a Simulation class that is responsible for reading itemLine data and 
    filling up the rockets. The Simulation class should include these methods:

    loadItems: this method loads all items from a text file and returns an 
    ArrayList of Items:
    Each line in the text file consists of the itemLine name followed by = 
    then its 
    weigh in kg. For example:

    loadItems should read the text file line by line and create an Item object 
    for each and then add it to an ArrayList of Items. The method should then 
    return that ArrayList.

loadU1: this method takes the ArrayList of Items returned from loadItems and 
starts creating U1 rockets. It first tries to fill up 1 rocket with as many 
items as possible before creating a new rocket object and filling that one until 
all items are loaded. The method then returns the ArrayList of those U1 rockets 
that are fully loaded.
loadU2: this method also takes the ArrayList of Items and starts creating U2 
rockets and filling them with those items the same way as with U1 until all items 
are loaded. The method then returns the ArrayList of those U2 rockets that are 
fully loaded.
runSimulation: this method takes an ArrayList of Rockets and calls launch and 
land methods for each of the rockets in the ArrayList. Every time a rocket 
explodes or crashes (index.e if launch or land return false) it will have to 
send that rocket again. All while keeping track of the total budget required to 
send each rocket safely to Mars. runSimulation then returns the total budget 
required to send all rockets (including the crashed ones).


The Mission
The mission consists of 2 phases:

Phase-1:
This phase is meant to send building equipment and construction material to help 
build the colony. In the resources tab, you will find a text file that contains 
the list of all items that we need to send called 'Phase-1.txt`. Each line in 
the file contains the itemLine name as well as its weight in Kgs.

The file is here.

Phase-2:
This phase is meant to send the colony of humans along with some food resources. 
In the resources tab, you will find a text file that contains the list of all 
items that we need to send called 'Phase-2.txt`. Each line in the file also 
contains the itemLine name and its weight in Kgs.

The file is here.

Your job is to run some simulations and test both rocket types for each phase 
separately.

Ready? let's have a look at the details ...





 */
package spaceproject;

import java.io.*;
import java.util.*;

/**
 *
 * @author eduardo
 */
public class Simulation {
    

    public Simulation() {
    }// default constructor
    
    /**
     * This method loads all items from a text file and returns an ArrayList of Items:
     * Each line in the text file consists of the itemLine name followed by 
     * = then its weigh in kg.For example: habitat=100000
     * @param fileName
     * @return  phase1_Items
     */
    public ArrayList loadItems(File fileName){
        // this file has to be seperated
        // itemLine name is a string and its int weight
        // declare local arrayList 
        ArrayList listOfItems = new ArrayList<>();
        
        // start reading the text file
        try {
            // need a scanner to read the contents of the file
            // pass the file object
            Scanner extFile = new Scanner(fileName);
            // loadItems should read the text file line by line
            // loop thru the fileName.txt file
            while (extFile.hasNextLine()) {
                // store each line (itemLine) into a string variable
                String itemLine = extFile.nextLine();
                // seperate the line
                String[] itemArray = itemLine.split("=");
                // assign to a String and Int to send to the itemLine object
                String name = itemArray[0];
                int weight = Integer.parseInt(itemArray[1]);
                // build the object array list of Item objects
                listOfItems.add( new Item(name, weight));
            }//end while(extFile.hasNextLine())
            // close the scanner
            extFile.close();
        } catch (FileNotFoundException error) {
            System.out.println(error);
        }// end try catch
        
        // The method should then return that ArrayList.
        return listOfItems;
    }// end loadItems
    
    public void loadU1(File cargoFile){
                /*
        loadU1: this method takes the ArrayList of Items returned from 
        loadItems 
        
        and starts creating U1 rockets. 
        
        It first tries to fill up 
        1 rocket with as many items as possible before creating a new rocket 
        object and filling that one until all items are loaded. 
        
        
        The method then returns the ArrayList of those U1 rockets 
        that are fully loaded.

        
        */
                 
        // this is the file in the directory
       // File cargoFile = new File("phase-1.txt");
        
        
        
        // create an instance of the simulation class
        Simulation loadU1RocketSim = new Simulation();
        // loadItems will return an arrayList
        ArrayList<Item> phaseItemsList = new ArrayList<Item>();
         // call the loadItems method and pass the file
        phaseItemsList = loadU1RocketSim.loadItems(cargoFile); // arrayList is returned
        // the size of the arrayList
        int cargoListSize = phaseItemsList.size();
  
        // create calculateRocketWeight class instance
        CalculateRocketWeight calculateRocketWeight = new CalculateRocketWeight();
        // use to determine once the rocket is full
        boolean canLaunchRocket = false;
        // load the cargo
        for (int index = 0; index < cargoListSize; index++) {
            Item cargoItem = new Item();
            // phaseItemsList is an arrayList
            // get the index and store the values from arrayList into cargoItem class 
            cargoItem = phaseItemsList.get(index);
            // calculate the weight
            canLaunchRocket = calculateRocketWeight.calculate_U1_CargoWeight(cargoItem);
            
            
            
            // create a U1 rocket
            if (canLaunchRocket) {
                //U1 u1Rocket = new U1(CalculateRocketWeight.totalU1CargoWeight);
               
                System.out.println("---------------------------U1 Rocket is full - launch " + U1.numberOfU1Rockets);
                
                // debug- 15 items in the file, but only a total 12 loaded onto rocket
                // there is a problem with the logic here
                // once the next item exceeds the weight limit - It is not loaded onto the next rocket
                
               
            
            }// end if

        }// end for (int index = 0; index < cargoListSize; index++) 
        System.out.println("total items that need to be loaded "+ Item.numberOfItems);
        System.out.println("total items loaded on a U1 rocket " + CalculateRocketWeight.cargoItemloaded);
        System.out.println("\n\n");
        

        
 
        
    }// end loadU1
    
    public void loadU2(){
       

        /*
        loadU2: this method also takes the ArrayList of Items and starts 
        creating U2 rockets and filling them with those items the same way 
        as with U1 until all items are loaded. The method then returns the 
        ArrayList of those U2 rockets that are fully loaded.
        */
        
   
    }// end loadU2
    
    public void runSimulation(){
        
    /*
        runSimulation: this method takes an ArrayList of Rockets and calls 
        launch and land methods for each of the rockets in the ArrayList. 
        Every time a rocket explodes or crashes (index.e if launch or land return 
        false) it will have to send that rocket again. All while keeping track 
        of the total budget required to send each rocket safely to Mars. 
        runSimulation then returns the total budget required to send all 
        rockets (including the crashed ones).

    */
    }// end runSimulation
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}// end Simulation Class
