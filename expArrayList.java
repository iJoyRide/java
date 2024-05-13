
import java.util.ArrayList;
import java.util.Arrays;

public class expArrayList {
    public static void main(String[] args) {

        String[] friendArrays = {"John", "Cena", "Eric", "Luke"};

        //Dynamically grow or string
        ArrayList<String> friendArrayList = new ArrayList<>(Arrays.asList("John", "Cena", "Eric", "Luke")); //Can only hold wrapper not primitive

        System.out.println(friendArrays[1]);
        System.out.println(friendArrays.length);

        System.out.println(friendArrayList.get(2));
        System.out.println(friendArrayList.size());

        friendArrayList.add("Dwayne");
        System.out.println(friendArrayList);

        friendArrayList.set(2, "Johnson");
        System.out.println(friendArrayList);

        friendArrayList.remove(0);
        System.out.println(friendArrayList);
        
        friendArrayList.remove("Luke");
        System.out.println(friendArrayList);
    }
}


