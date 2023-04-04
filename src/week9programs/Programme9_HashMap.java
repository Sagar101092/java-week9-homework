package week9programs;


import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme9_HashMap {
    public static void main(String[] args) //main method declared
    {
        Programme9_HashMap obj = new Programme9_HashMap(); //instance obj created for instance method
        obj.map(); //instance method calling
    }

    public void map() {
        Map<String, Integer> people = new HashMap<>(); //hashmap obj created
        //obj elements
        people.put("Sagar", 1);
        people.put("Rushi", 2);
        people.put("Kuntal", 3);
        people.put("Himanshu", 4);
        for (Map.Entry<String, Integer> map : people.entrySet()) //iterate value from map
        {
            System.out.println(map.getKey() + " " + map.getValue()); //print elements from collection
        }
    }

}