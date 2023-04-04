package week9programs;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme6_RetrieveArrayList {

    public static void main(String[] args) {
        Programme6_RetrieveArrayList obj = new Programme6_RetrieveArrayList(); //obj created for instance method
        obj.retrieve(); // instance method calling in main method
    }

    public void retrieve() {
        ArrayList list = new ArrayList(); //obj created for arraylist
        //Add obj into list collection
        list.add("Black");
        list.add("White");
        list.add("Pink");
        list.add("Red");
        list.add("Brown");
        Iterator newList = list.iterator();
        // newList.hasNext();
        while (newList.hasNext()) {
            System.out.println(newList.next());
        }
        System.out.println("Value at 3rd Index is :  " + list.get(2)); //print the value which is at 3rd index
    }
}
