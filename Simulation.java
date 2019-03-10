/*
    Create a Simulation class that is responsible for reading item data and 
    filling up the rockets. The Simulation class should include these methods:

    loadItems: this method loads all items from a text file and returns an 
    ArrayList of Items:
    Each line in the text file consists of the item name followed by = then its 
    weigh in kg. For example:

loadItems should read the text file line by line and create an Item object for each and then add it to an ArrayList of Items. The method should then return that ArrayList.

loadU1: this method takes the ArrayList of Items returned from loadItems and starts creating U1 rockets. It first tries to fill up 1 rocket with as many items as possible before creating a new rocket object and filling that one until all items are loaded. The method then returns the ArrayList of those U1 rockets that are fully loaded.
loadU2: this method also takes the ArrayList of Items and starts creating U2 rockets and filling them with those items the same way as with U1 until all items are loaded. The method then returns the ArrayList of those U2 rockets that are fully loaded.
runSimulation: this method takes an ArrayList of Rockets and calls launch and land methods for each of the rockets in the ArrayList. Every time a rocket explodes or crashes (i.e if launch or land return false) it will have to send that rocket again. All while keeping track of the total budget required to send each rocket safely to Mars. runSimulation then returns the total budget required to send all rockets (including the crashed ones).








 */
package spaceproject;

import java.io.*;
import java.util.*;

/**
 *
 * @author eduardo
 */
public class Simulation {
    
    private ArrayList allitems;

    public Simulation() {
        
        allitems = new ArrayList();
        
        
    }// default 

   
    
    
    
    
    
    /**
     * this method loads all items from a text file and returns an 
     * ArrayList of Items:
     * Each line in the text file consists of the item name followed by = then its
     * weigh in kg.For example: habitat=100000
     * @param fileName
     * @return 
     */
    public ArrayList loadItems(File fileName){
        // this file has to be seperated
        // item name is a string and its int weight
        try {
            // need a scanner to read the contents of the file
            // pass the file object
            Scanner extFile = new Scanner(fileName);
            // loop thru the fileName.txt file
            while (extFile.hasNextLine()) {
                // store each line (item) into a string variable
                String item = extFile.nextLine();
                
                String[] itemArray = item.split("=");
                
                for (String items : itemArray) {
                    
                    //System.out.println(items);
                    // build the arrayList
                    allitems.add(items);
                    
                }
                
                
                
                
               
            }//end while
            // close the scanner
            extFile.close();
        } catch (FileNotFoundException error) {
            System.out.println(error);
        }// end try catch
        
        return allitems;
    }// end loadItems
    
    public void loadU1(){
        
        /*
        loadU1: this method takes the ArrayList of Items returned from 
        loadItems and starts creating U1 rockets. It first tries to fill up 
        1 rocket with as many items as possible before creating a new rocket 
        object and filling that one until all items are loaded. 
        The method then returns the ArrayList of those U1 rockets 
        that are fully loaded.

        
        */
        
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
        Every time a rocket explodes or crashes (i.e if launch or land return 
        false) it will have to send that rocket again. All while keeping track 
        of the total budget required to send each rocket safely to Mars. 
        runSimulation then returns the total budget required to send all 
        rockets (including the crashed ones).

    */
    }// end runSimulation
    
    
    
}// end Simulation Class
