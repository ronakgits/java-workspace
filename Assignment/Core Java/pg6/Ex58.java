import java.util.ArrayList;
import java.util.Collections;

public class Ex58 {

    public static void main(String[] args) {

        ArrayList<Integer> numbersList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbersList.add(i);
        }

        System.out.println("Original ArrayList: " + numbersList);

        Collections.shuffle(numbersList);

        System.out.println("Shuffled ArrayList: " + numbersList);
    }
}
