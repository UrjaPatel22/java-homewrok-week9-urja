package homeworkweek9;
/**
 *
 * 11. Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */

import java.util.ArrayList;

public class Program11 {

    public  void compareListMethod() {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("First  List:  " + c1);
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("Second List: " + c2);
        // Find common list

        ArrayList<String> c3 = new ArrayList<>();
        for (String s : c1) {
            c3.add(c2.contains(s) ? "Yes" : "No");

        }
        System.out.println(c3);
    }

    public static void main(String[] args) {
       Program11 obj = new Program11();
       obj.compareListMethod();

    }



}
