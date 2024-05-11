import java.util.Arrays;

public class expArray2D {
    public static void main(String[] args) {

        String [][] numbers = {{"X", "O", "O"}, {"X", "X", "O"}, {"O", "O", "x"}};

        System.out.println(Arrays.deepToString(numbers));
        System.out.println("\n");

        for(String[] row : numbers){ // for each row in numbers array
            System.out.println(Arrays.toString(row));
        }

        System.out.println("\nPLAYER: X wins!");

    }
}
