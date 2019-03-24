/*
    PART 3: Running the Simulation
    Create a Main class with the main method and start running the simulation:

    Create a Simulation object
    Load Items for Phase-1 and Phase-2
    Load a fleet of U1 rockets for Phase-1 and then for Phase-2
    Run the simulation using the fleet of U1 rockets and display the total 
    budget required.
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
        
        // loads into U1 Rocket

        File phaseOne = new File("phase-1.txt");
        File phaseTwo = new File("phase-2.txt");
        Simulation sim = new Simulation();
        sim.loadU1(phaseOne);
        System.out.println("-----------------------"
                + "Start phase 2 --------------------");
        sim.loadU1(phaseTwo);
        //sim.loadU2();
        
     
        
    }// end main
    
}// end test
