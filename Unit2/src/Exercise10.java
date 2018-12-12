import java.util.Scanner;

public class Exercise10 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First num: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (isEven(num1) == true && isEven(num2) == true) {
            System.out.println(num1 + " and " + num2 + " are even numbers");
        } else if (isEven(num1) == false && isEven(num2) == false) {
            System.out.println(num1 + " and " + num2 + " are odd numbers");
        } else {
            System.out.println("One is odd, one is even");
        }
        input.close();
    }
    
    public static boolean isEven(int x) {
        if (x%2 == 0){
//            System.out.println(x + " is even");
            return true;
        } else {
//            System.out.println(x + " is odd");
            return false;
        }
    }
}