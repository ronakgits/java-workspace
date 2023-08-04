import java.util.ArrayList;

public class Ex67 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");
        arrayList.add("Mango");

        System.out.println("Original ArrayList: " + arrayList);

        int position1 = 1;
        int position2 = 3;

        swapElements(arrayList, position1, position2);

        System.out.println("ArrayList after swapping: " + arrayList);
    }

    private static void swapElements(ArrayList<String> list, int pos1, int pos2) {

        String temp = list.get(pos1);
        
        list.set(pos1, list.get(pos2));
        list.set(pos2, temp);
    }
}

// Original ArrayList: [Apple, Banana, Orange, Grapes, Mango]
// ArrayList after swapping: [Apple, Grapes, Orange, Banana, Mango]
