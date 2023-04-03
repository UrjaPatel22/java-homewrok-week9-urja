package homeworkweek9;
/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

import java.util.ArrayList;

public class Program4 {

    public static void main(String[] args) {
        coloursMethod();

    }

    public static void coloursMethod() {
        ArrayList <String> list = new ArrayList();
        list.add("Yellow");
        list.add("Green");
        list.add("Blue");
        list.add("Pink");
        list.add("white");
        list.add("Black");
        for (String a : list) {
            System.out.println(a);
        }

    }

}