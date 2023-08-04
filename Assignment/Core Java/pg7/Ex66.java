import java.util.ArrayList;

public class Ex66 {

    public static void main(String[] args) {
    
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Apple");
        list2.add("Banana");
        list2.add("Orange");

        boolean isEqual = list1.equals(list2);

        if (isEqual) {

            System.out.println("The two ArrayLists are equal.");

        } else {

            System.out.println("The two ArrayLists are not equal.");
        }
    }
}

// The two ArrayLists are equal.
