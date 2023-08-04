import java.util.ArrayList;

public class Ex51 {

    public static void main(String[] args) {

        ArrayList<String> fruitsList = new ArrayList<>();

        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");

        fruitsList.add(0, "Mango");

        System.out.println("Updated ArrayList:");

        for (String fruit : fruitsList) {

            System.out.println(fruit);
        }
    }
}
