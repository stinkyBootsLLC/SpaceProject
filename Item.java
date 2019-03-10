/*
    Create an Item class that includes a String name and an int weight that will 
    represent an item to be carried by the rockets
 */
package spaceproject;

/**
 *
 * @author eduardo
 */
public class Item {
    String name;
    int weight;//represent an item to be carried by the rockets

    public Item() {
    }// default constructor

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }// end parameter constructor

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Item{" + "name = " + name + ", weight = " + weight + " kg}\n";
    }
    
    
    
    
    
    
    
}// end Item class
