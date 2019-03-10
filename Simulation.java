/*
    Create a Simulation class that is responsible for reading itemLine data and 
    filling up the rockets. The Simulation class should include these methods:

    loadItems: this method loads all items from a text file and returns an 
    ArrayList of Items:
    Each line in the text file consists of the itemLine name followed by = then its 
    weigh in kg. For example:

    loadItems should read the text file line by line and create an Item object 
    for each and then add it to an ArrayList of Items. The method should then 
    return that ArrayList.

loadU1: this method takes the ArrayList of Items returned from loadItems and starts creating U1 rockets. It first tries to fill up 1 rocket with as many items as possible before creating a new rocket object and filling that one until all items are loaded. The method then returns the ArrayList of those U1 rockets that are fully loaded.
loadU2: this method also takes the ArrayList of Items and starts creating U2 rockets and filling them with those items the same way as with U1 until all items are loaded. The method then returns the ArrayList of those U2 rockets that are fully loaded.
runSimulation: this method takes an ArrayList of Rockets and calls launch and land methods for each of the rockets in the ArrayList. Every time a rocket explodes or crashes (i.e if launch or land return false) it will have to send that rocket again. All while keeping track of the total budget required to send each rocket safely to Mars. runSimulation then returns the total budget required to send all rockets (including the crashed ones).


The Mission
The mission consists of 2 phases:

Phase-1:
This phase is meant to send building equipment and construction material to help build the colony. In the resources tab, you will find a text file that contains the list of all items that we need to send called 'Phase-1.txt`. Each line in the file contains the itemLine name as well as its weight in Kgs.

The file is here.

Phase-2:
This phase is meant to send the colony of humans along with some food resources. In the resources tab, you will find a text file that contains the list of all items that we need to send called 'Phase-2.txt`. Each line in the file also contains the itemLine name and its weight in Kgs.

The file is here.

Your job is to run some simulations and test both rocket types for each phase separately.

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
    
    private final ArrayList allitems;

    public Simulation() {
        allitems = new ArrayList();
    }// default constructor
    
    /**
     * This method loads all items from a text file and returns an ArrayList of Items:
     * Each line in the text file consists of the itemLine name followed by 
     * = then its weigh in kg.For example: habitat=100000
     * @param fileName
     * @return 
     */
    public ArrayList loadItems(File fileName){
        // this file has to be seperated
        // itemLine name is a string and its int weight
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
                //create an Item object 
                Item item = new Item(name, weight);
                // debug
                System.out.println(item.toString());
                // build the arrayList
                for (String items : itemArray) {
                //and then add it to an ArrayList of Items. 
                    allitems.add(items);
                }// end for (String items : itemArray)
            }//end while(extFile.hasNextLine())
            // close the scanner
            extFile.close();
        } catch (FileNotFoundException error) {
            System.out.println(error);
        }// end try catch
        
        // The method should then return that ArrayList.
        return allitems;
    }// end loadItems
    
    public void loadU1(){
        
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
