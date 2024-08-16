package project;

public class pyramid {
    public static void main(String[] args) {
        int row = 3;
        int k = 0;

        //To start each row and reset k
        for(int i = 1; i <= row; i++, k = 0){
            //Print empty space
            for(int space = 1; space <= row - i; space ++ ){
                System.out.print("_");
            }

            while(k != 2 * i - 1){
                System.out.print("*");
                ++k;
            }

            System.out.println();
        }
    }
}
