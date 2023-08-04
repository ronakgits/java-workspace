import java.util.Scanner;

public class Ex34 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks (out of 100): ");
        int marks = scanner.nextInt();

        displayGrade(marks);
    }

    public static void displayGrade(int marks) {

        String grade;

        if (marks >= 91 && marks <= 100) 
        {
            grade = "AA";

        } else if (marks >= 81 && marks <= 90) {

            grade = "AB";

        } else if (marks >= 71 && marks <= 80) {

            grade = "BB";

        } else if (marks >= 61 && marks <= 70) {

            grade = "BC";

        } else if (marks >= 51 && marks <= 60) {

            grade = "CD";

        } else if (marks >= 41 && marks <= 50) {

            grade = "DD";

        } else if (marks == 40) {

            grade = "Fail";

        } else {

            grade = "Invalid Marks";
        }

        System.out.println("Your Grade: " + grade);
    }
}
