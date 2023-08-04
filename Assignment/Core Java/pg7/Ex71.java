import java.util.HashMap;
import java.util.Map;

public class Ex71 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        boolean isEmpty = map.isEmpty();

        if (isEmpty) {

            System.out.println("The map is empty.");

        } else {

            System.out.println("The map is not empty.");
        }

        map.put("apple", 5);
        map.put("banana", 10);
        map.put("orange", 8);

        isEmpty = map.isEmpty();

        if (isEmpty) {

            System.out.println("The map is empty.");

        } else {
            
            System.out.println("The map is not empty.");
        }
    }
}

// The map is empty.
// The map is not empty.
