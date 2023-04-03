package homeworkweek9;

/**
 * 7. Write a Java program to test if an array list is empty or not.
 */

import java.util.ArrayList;

public class Program7 {
    public static void main(String[] args) {
Program7 obj = new Program7();
obj.isEmptyMethod();

    }
        public void isEmptyMethod(){

        ArrayList list = new ArrayList();
        list.add("Apple");
        list.add("Mango");
        list.add("Orange");
        list.add("Strawberry");
        list.add("Banana");
        System.out.println("Original Array List"   +list);
        System.out.println("Checking the Above list is empty or not!! " +list.isEmpty());
        list.removeAll(list);
        System.out.println("Array list after remove all elements "  +list);
        System.out.println("Checking the Above list is empty or not!! "  +list.isEmpty());
    }

}
