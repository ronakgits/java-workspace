import java.util.ArrayList;

public class Ex53 {

    public static void main(String[] args) {

        ArrayList<String> fruitsList = new ArrayList<>();

        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");

        System.out.println("Original ArrayList: " + fruitsList);

        int indexToUpdate = 1; 

        String newElement = "Mango";
        
        if (indexToUpdate >= 0 && indexToUpdate < fruitsList.size()) {

            fruitsList.set(indexToUpdate, newElement);
            System.out.println("Element at index " + indexToUpdate + " updated to: " + newElement);

        } else {

            System.out.println("Invalid index!");
        }

        System.out.println("Updated ArrayList: " + fruitsList);
    }
}
