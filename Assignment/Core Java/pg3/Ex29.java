abstract class Parent {
	
    public abstract void message();
}

class FirstSubclass extends Parent {
	
    @Override
    public void message() {
    	
        System.out.println("This is first subclass");
    }
}

class SecondSubclass extends Parent {
	
    @Override
    public void message() {
    	
        System.out.println("This is second subclass");
    }
}

public class Ex29 {
	
    public static void main(String[] args) {
    	
        Parent obj1 = new FirstSubclass();
        Parent obj2 = new SecondSubclass();

        obj1.message();
        obj2.message();
    }
}
