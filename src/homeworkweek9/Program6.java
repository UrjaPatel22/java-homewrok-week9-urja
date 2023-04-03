package homeworkweek9;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

import java.util.ArrayList;

public class Program6 {

    public static void main(String[] args) {
retrieveMethod();
    }
    public static void retrieveMethod(){
        ArrayList list = new ArrayList();
        list.add("Yellow");
        list.add("Green");
        list.add("Blue");
        list.add("Pink");
        list.add("white");
        list.add("Black");

        //print the list
        System.out.println(list);

        //  Retrieve the first and fourth element
         String element = (String)list.get(0);
         System.out.println("First element: "+element);
          element = (String)list.get(3);
          System.out.println("Third element: "+element);
    }
}