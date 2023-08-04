import java.util.ArrayList;

public class Ex72 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        System.out.println("Initial size of the ArrayList: " + arrayList.size());

        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");

        System.out.println("Size of the ArrayList after adding elements: " + arrayList.size());
    }
}

// Initial size of the ArrayList: 0
// Size of the ArrayList after adding elements: 3
