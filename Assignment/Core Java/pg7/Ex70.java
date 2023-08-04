import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class Ex70 {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");
        hashSet.add("Mango");

        ArrayList<String> arrayList = new ArrayList<>(hashSet);

        System.out.println("ArrayList elements:");

        for (String element : arrayList) {

            System.out.println(element);
        }

        List<String> list = new ArrayList<>(hashSet);

        System.out.println("\nList elements:");

        for (String element : list) {

            System.out.println(element);
        }
    }
}

/*

Output: 

ArrayList elements:
Apple
Mango
Banana
Grapes
Orange

List elements:
Apple
Mango
Banana
Grapes
Orange

*/