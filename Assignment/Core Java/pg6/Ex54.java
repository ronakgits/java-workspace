import java.util.ArrayList;

public class Ex54 {

    public static void main(String[] args) {

        ArrayList<String> fruitsList = new ArrayList<>();

        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");
        fruitsList.add("Mango");

        System.out.println("Original ArrayList: " + fruitsList);

        int indexToRemove = 2; 

        if (indexToRemove >= 0 && indexToRemove < fruitsList.size()) {

            String removedElement = fruitsList.remove(indexToRemove);
            System.out.println("Removed element at index " + indexToRemove + ": " + removedElement);

        } else {

            System.out.println("Invalid index!");
        }

        System.out.println("ArrayList after removal: " + fruitsList);
    }
}
