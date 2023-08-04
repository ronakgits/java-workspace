import java.util.ArrayList;
import java.util.List;

public class Ex68 {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");


        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Grapes");
        list2.add("Mango");
        list2.add("Pineapple");
 

        ArrayList<String> joinedList = new ArrayList<>();

        joinedList.addAll(list1);
        joinedList.addAll(list2);

        System.out.println("Joined ArrayList: " + joinedList);
    }
}

// Joined ArrayList: [Apple, Banana, Orange, Grapes, Mango, Pineapple]
