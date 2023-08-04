import java.util.ArrayList;

public class Ex74 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");
        arrayList.add("Mango");

        System.out.println("Elements of the ArrayList with their positions:");

        for (int i = 0; i < arrayList.size(); i++) {

            System.out.println("Position " + i + ": " + arrayList.get(i));
        }
    }
}

/*

Output: 

Elements of the ArrayList with their positions:
Position 0: Apple
Position 1: Banana
Position 2: Orange
Position 3: Grapes
Position 4: Mango

*/