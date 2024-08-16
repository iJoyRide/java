package project;

public class largestElement {

    static int[] arr = {1,5,15,4,9};

    static int bigNum(){
        int max = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("The largest number is " + bigNum());
    }
}
