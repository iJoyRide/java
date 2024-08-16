package project;
import java.util.Scanner;

public class findFactorial {

    public static void Factorial(int number){

        int res = 1, i;
        for (i = 2; i <= number; i++){
            res *= i;
        }
        System.out.println("The factorial of " + number + " is " + res);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        Factorial(number);
    }

}
