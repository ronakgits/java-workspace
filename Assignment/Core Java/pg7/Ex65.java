import java.util.ArrayList;
import java.util.List;

public class Ex65 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");
        arrayList.add("Mango");

        System.out.println("Original ArrayList: " + arrayList);

        int fromIndex = 1; 
        int toIndex = 4;   

        List<String> portion = arrayList.subList(fromIndex, toIndex);

        System.out.println("Extracted Portion: " + portion);
    }
}

// Original ArrayList: [Apple, Banana, Orange, Grapes, Mango]
// Extracted Portion: [Banana, Orange, Grapes]
