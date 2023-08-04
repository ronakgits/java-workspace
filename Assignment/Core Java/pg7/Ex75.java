import java.util.HashSet;

public class Ex75 {

    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<>();

        set1.add("Apple");
        set1.add("Banana");
        set1.add("Orange");

        HashSet<String> set2 = new HashSet<>();

        set2.add("Orange");
        set2.add("Grapes");
        set2.add("Mango");

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        set1.retainAll(set2);

        System.out.println("Elements retained in both sets: " + set1);
    }
}

/*

Output: 

Set 1: [Apple, Banana, Orange]
Set 2: [Grapes, Mango, Orange]
Elements retained in both sets: [Orange]

*/