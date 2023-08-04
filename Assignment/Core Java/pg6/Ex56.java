import java.util.ArrayList;
import java.util.Collections;

public class Ex56 {

    public static void main(String[] args) {

        ArrayList<String> fruitsList = new ArrayList<>();

        fruitsList.add("Banana");
        fruitsList.add("Orange");
        fruitsList.add("Mango");
        fruitsList.add("Apple");

        System.out.println("Original ArrayList: " + fruitsList);

        Collections.sort(fruitsList);

        System.out.println("Sorted ArrayList: " + fruitsList);
    }
}
