import java.util.HashMap;
import java.util.Map;

public class Ex63 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("apple", 5);
        map.put("banana", 10);
        map.put("orange", 8);

        int size = map.size();

        System.out.println("Number of key-value mappings in the map: " + size);
    }
}

// Number of key-value mappings in the map: 3
