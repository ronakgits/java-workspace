class AgeNotWithinRangeException extends Exception {

    public AgeNotWithinRangeException(String message) {

        super(message);
    }
}

class NameNotValidException extends Exception {

    public NameNotValidException(String message) {

        super(message);
    }
}

class Student {

    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {

        this.rollNo = rollNo;
        validateName(name);
        validateAge(age);
        this.name = name;
        this.age = age;
        this.course = course;
    }

    private void validateAge(int age) throws AgeNotWithinRangeException {

        if (age < 15 || age > 21) {

            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
        }
    }

    private void validateName(String name) throws NameNotValidException {

        if (name.matches(".*\\d.*") || !name.matches("[a-zA-Z ]+")) {

            throw new NameNotValidException("Name should not contain numbers or special symbols.");
        }
    }


    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}

public class Ex43 {

    public static void main(String[] args) {

        try {
            
            Student student1 = new Student(1, "John Doe", 20, "Computer Science");
            System.out.println("Student details:");
            System.out.println("Roll No: " + student1.getRollNo());
            System.out.println("Name: " + student1.getName());
            System.out.println("Age: " + student1.getAge());
            System.out.println("Course: " + student1.getCourse());

        } catch (AgeNotWithinRangeException e) {

            System.out.println("AgeNotWithinRangeException: " + e.getMessage());

        } catch (NameNotValidException e) {

            System.out.println("NameNotValidException: " + e.getMessage());
        }
    }
}
