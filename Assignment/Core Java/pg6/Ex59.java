import java.util.HashSet;

public class Ex59 {

    public static void main(String[] args) {

        HashSet<String> colorsSet = new HashSet<>();

        colorsSet.add("Red");
        colorsSet.add("Green");
        colorsSet.add("Blue");

        System.out.println("Original HashSet: " + colorsSet);

        String newColor = "Yellow";
        colorsSet.add(newColor);

        System.out.println("Updated HashSet: " + colorsSet);
    }
}
