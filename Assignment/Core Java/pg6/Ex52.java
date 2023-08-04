import java.util.ArrayList;

public class Ex52 {

    public static void main(String[] args) {

        ArrayList<String> fruitsList = new ArrayList<>();

        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");

        int indexToRetrieve = 1; 

        if (indexToRetrieve >= 0 && indexToRetrieve < fruitsList.size()) {

            String retrievedElement = fruitsList.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + ": " + retrievedElement);

        } else {
            
            System.out.println("Invalid index!");
        }
    }
}
