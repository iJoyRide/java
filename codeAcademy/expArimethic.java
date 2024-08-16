package codeAcademy;

public class expArimethic {
    public static void main(String[] args) {

        int result1 = 10 / 3;
        double result2 = (double) 10 / (double) 3; // casting
        float result3 = (float) 10 / (float) 3; // casting

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3 + "\n");

        int x = (10 + 3) * 5; // parenthesis takes higher priority
        int y = 10 + 3 * 5;

        System.out.println(x);
        System.out.println(y);

        short z = 1;
        int a = z + 2;

        System.out.println(a);

        // implicit casting
        // byte > short> int> long > float> double

        double num1 = 1.1;
        double num2 = num1 + 2;
        System.out.println(num2);

        String word = "1.1";
        double word1 = Double.parseDouble(word) + 2;
        double word2 = Double.parseDouble(word) + 5;
        System.out.println(word1);
        System.out.println(word2);


    }
}
