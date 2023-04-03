package calculate;

public class Calculator {

    public void addition(int a, int b){
        System.out.println("Addition of" +a + "and"  +b+ "is" +(a+b));
    }
    public void subtraction(int a, int b){
        System.out.println("Substraction of"  +a+ "and"  +b+   "is"  +(a-b));
    }

    public void division(int a, int b){
        System.out.println("Division of"  +a+ "and"  +b+   "is"  +(a/b));
    }

    public void multiplication(int a, int b){
        System.out.println("Multiplicaton  of"  +a+ "and"  +b+   "is"  +(a*b));
    }


public static void calculateResult(int a, int b, char symbol){
    if (symbol == '+') {
        System.out.println(a + " + " + b + " = " + (a + b));
    } else if (symbol == '-') {
        System.out.println(a + " - " + b + " = " + (a - b));
    } else if (symbol == '/') {
        System.out.println(a + " / " + b + " = " + (a / b));
    }
    else if (symbol == '*') {
        System.out.println(a + " x " + b + " = " + (a * b));
    }
     else {
        System.out.println("Please enter correct symbol +,-,*,/");
    }
}

}
