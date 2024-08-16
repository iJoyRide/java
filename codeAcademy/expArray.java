package codeAcademy;

import java.util.Arrays;

public class expArray {
    public static void main(String[] args) {

        int[] newArray = new int[5]; // Creating a new array with a length of 5

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (i + 2); // Adding 2 to index i
        }

        int[] otherArray = { 1, 2, 3, 4, 5 }; // Initializing otherArray with values 1, 2, 3, 4, 5

        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(otherArray));
    }
}
