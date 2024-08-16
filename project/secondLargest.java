package project;

import java.util.Arrays;

public class secondLargest {
    static int[] arr = {1,5,15,4,9};

    public static void main(String[] args) {
        Arrays.sort(arr);
        System.out.println("The 2nd largest number is " + arr[arr.length - 2]);
    }
}
