import java.util.ArrayList;
import java.util.Collections;

public class Ex64 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");
        arrayList.add("Mango");

        System.out.println("Original ArrayList: " + arrayList);

        Collections.reverse(arrayList);

        System.out.println("Reversed ArrayList: " + arrayList);
    }
}

// Original ArrayList: [Apple, Banana, Orange, Grapes, Mango]
// Reversed ArrayList: [Mango, Grapes, Orange, Banana, Apple]
