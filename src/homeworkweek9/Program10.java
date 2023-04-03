package homeworkweek9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Program10 {
    public static void main(String[] args) {



        Map<String, ArrayList<String>> Line1 = new HashMap<String, ArrayList<String>>();
        Line1.put("Aldgate", new ArrayList<String>());
        Line1.get("Aldgate").add("Circle Line");
        Line1.get("Aldgate").add("Metropolitan Line");



       Line1.put("Bank", new ArrayList<String>());
       Line1.get("Bank").add("Jubilee Line");
        Line1.get("Bank").add("Bakerloo Line");
        Line1.get("Bank").add("Metropolitan Line");
        Line1.get("Bank").add("DLR");



        Line1.put("BakerStreet", new ArrayList<String>());
        Line1.get("BakerStreet").add("Bakerloo Line");
        Line1.get("BakerStreet").add("Circle Line");
        Line1.get("BakerStreet").add("Jubilee Line");
        Line1.get("BakerStreet").add("Metropolitan Line");

        Line1.put("BondStreet", new ArrayList<String>());
        Line1.get("BondStreet").add("Jubilee Line");
        Line1.get("BondStreet").add("Centeral Line");


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the station name: ");
        String nameOfStation = sc.next();
        System.out.println("Line is Passing through "  + nameOfStation +  "  is "  +Line1.get(nameOfStation));
        System.out.println(nameOfStation + " Is in the Zone 1"  );
        sc.close();

        }


}
