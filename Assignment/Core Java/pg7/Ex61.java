import java.util.HashSet;

public class Ex61 {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");
        hashSet.add("Mango");

        int size = hashSet.size();

        System.out.println("Number of elements in the HashSet: " + size);
    }
}

// Number of elements in the HashSet: 5
