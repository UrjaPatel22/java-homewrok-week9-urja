package homeworkweek9;
/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

import java.util.HashSet;

public class Program8 {

    public static void main(String[] args) {
   Program8 obj = new Program8();
     obj.hashSetMethod();
    }

    public void hashSetMethod(){
        HashSet<Integer> numbers= new HashSet<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        for(int i =1;i<=10;i++){
            if(numbers.contains(i)){
                System.out.println(i + " Was Found in the set");
            }
            else {
                System.out.println(i + " Was not found in the set");
            }
        }
    }

}
