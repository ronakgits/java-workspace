import java.util.HashSet;

public class Ex69 {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");
        hashSet.add("Mango");

        String[] array = hashSet.toArray(new String[0]);

        System.out.println("Array elements:");

        for (String element : array) {

            System.out.println(element);
        }
    }
}

/*

Array elements:
Apple
Mango
Banana
Grapes
Orange

*/