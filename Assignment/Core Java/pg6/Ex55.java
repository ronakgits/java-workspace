import java.util.ArrayList;
import java.util.Scanner;

public class Ex55 {

    public static void main(String[] args) {

        ArrayList<String> fruitsList = new ArrayList<>();

        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");
        fruitsList.add("Mango");

        System.out.println("Original ArrayList: " + fruitsList);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element to search: ");
        String elementToSearch = sc.nextLine();

        int index = fruitsList.indexOf(elementToSearch);

        if (index != -1) {

            System.out.println("Element found at index: " + index);

        } else {

            System.out.println("Element not found in the ArrayList.");
        }
    }
}
