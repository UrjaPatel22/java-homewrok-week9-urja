package homeworkweek9;
/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;
import java.util.Map;

public class Program9 {


    public static void hashMapMethod() {

        Map<String, Integer> people = new HashMap<>();
        // Add Student Name and Roll No
        people.put("John", 22);
        people.put("Smith", 12);
        people.put("Alena", 45);
        people.put("Sam", 34);

        for (Map.Entry<String,Integer> map :people.entrySet()) {
            System.out.println(map.getKey() + " "  + map.getValue());
        }
    }

    public static void main(String[] args) {
        hashMapMethod();
    }

}
