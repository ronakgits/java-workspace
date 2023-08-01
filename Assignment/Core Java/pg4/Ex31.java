abstract class Marks {

    public abstract double getPercentage();
}

class A extends Marks {

    private int subject1Marks;
    private int subject2Marks;
    private int subject3Marks;

    public A(int subject1Marks, int subject2Marks, int subject3Marks) {

        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }

    @Override
    public double getPercentage() {

        return (subject1Marks + subject2Marks + subject3Marks) / 3.0;
    }
}

class B extends Marks {

    private int subject1Marks;
    private int subject2Marks;
    private int subject3Marks;
    private int subject4Marks;

    public B(int subject1Marks, int subject2Marks, int subject3Marks, int subject4Marks) {

        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
        this.subject4Marks = subject4Marks;
    }

    @Override
    public double getPercentage() {

        return (subject1Marks + subject2Marks + subject3Marks + subject4Marks) / 4.0;
    }
}

public class Main {

    public static void main(String[] args) {

        A studentA = new A(80, 90, 85);
        B studentB = new B(70, 85, 75, 80);

        System.out.println("Percentage of marks for Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of marks for Student B: " + studentB.getPercentage() + "%");
    }
}
