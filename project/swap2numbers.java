package project;
import java.util.*;

public class swap2numbers {

    public static void swapValues(int a, int b){

        int temp = a;
        a = b;

        b = temp;
        System.out.println("The new value for a and b is " + a + " and " + b + " respectively");
    }

    public static void main(String[] args) {

        int a = 5, b = 10;

        swapValues(a,b);
    }
}
