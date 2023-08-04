import java.util.HashMap;
import java.util.Collection;

public class Ex76 {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Orange");
        hashMap.put(4, "Grapes");
        hashMap.put(5, "Mango");

        Collection<String> values = hashMap.values();

        System.out.println("Collection view of values: " + values);
    }
}

// Collection view of values: [Apple, Banana, Orange, Grapes, Mango]

