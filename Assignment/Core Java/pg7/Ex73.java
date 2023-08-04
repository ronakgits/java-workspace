import java.util.ArrayList;

public class Ex73 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");
        arrayList.add("Mango");

        System.out.println("Original ArrayList: " + arrayList);

        String newElement = "Pineapple";
        arrayList.set(1, newElement);

        System.out.println("ArrayList after replacing the second element: " + arrayList);
    }
}

// Original ArrayList: [Apple, Banana, Orange, Grapes, Mango]
// ArrayList after replacing the second element: [Apple, Pineapple, Orange, Grapes, Mango]
