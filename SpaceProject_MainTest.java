/*
PART 3: Running the Simulation
Create a Main class with the main method and start running the simulation:

Create a Simulation object
Load Items for Phase-1 and Phase-2
Load a fleet of U1 rockets for Phase-1 and then for Phase-2
Run the simulation using the fleet of U1 rockets and display the total budget required.
Repeat the same for U2 rockets and display the total budget for that.
 */
package spaceproject;

import java.io.File;
import java.util.*;

/**
 *
 * @author eduardo
 */
public class SpaceProject_MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* PHASE 1 TEST */
        // this is the file in the directory
        File phase1 = new File("phase-1.txt");
        // create an instance of the simulation class
        Simulation test1 = new Simulation();
        // loadItems will return an arrayList
        ArrayList phase1Items = new ArrayList();
         // call the loadItems method and pass the file
        phase1Items = test1.loadItems(phase1);
        // debug print the list
        System.out.println(phase1Items);
        //test1.loadItems(phase2);
        
        /* PHASE 2 TEST */
        // this is the file in the directory
        File phase2 = new File("phase-2.txt");
        // create an instance of the simulation class
        Simulation test2 = new Simulation();
        // loadItems will return an arrayList
        ArrayList phase2Items = new ArrayList();
         // call the loadItems method and pass the file
        phase2Items = test2.loadItems(phase2);
        // debug print the list
        System.out.println(phase2Items);
        //test1.loadItems(phase2);
       
        // test the U1 default
        U1 u1 = new U1();
        System.out.println(u1.toString());
        
        
        
    }// end main
    
}// end test
