import java.util.ArrayList;

public class Ex50 {

    public static void main(String[] args) {

        ArrayList<Integer> numbersList = new ArrayList<>();

        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);
        numbersList.add(50);

        System.out.println("Elements in the ArrayList:");

        for (int number : numbersList) {
            
            System.out.println(number);
        }
    }
}
