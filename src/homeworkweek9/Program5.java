package homeworkweek9;
/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterater
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Program5 {

    public static void main(String[] args) {
        Program5 obj = new Program5();
        obj.iteratorMethod();

    }

    public void iteratorMethod() {
        ArrayList list = new ArrayList();
        list.add("Yellow");
        list.add("Green");
        list.add("Blue");
        list.add("Pink");
        list.add("white");
        list.add("Black");

        Iterator<String> iter = list.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
