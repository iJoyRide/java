package project;

public class sumArray {

    static int[] arr = {1,2,3,4,5};
    static int sum = 0;
    public static void main(String[] args) {

        for (int i = 0; i <= arr.length; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}
