package homeworkweek9;

/**
 * 3. Write a Java program to reverse an array of integer values.
 */


import java.util.ArrayList;
import java.util.Collections;


public class Program3 {

    public static void main(String[] args) {
        Program3 obj = new Program3();
        obj.arrayReverseMethod();

    }

    public void arrayReverseMethod() {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);

        System.out.println("Before Reversing");
        System.out.println(l);
        Collections.reverse(l);
        System.out.println("After Reversing");
        System.out.println(l);
    }


}



