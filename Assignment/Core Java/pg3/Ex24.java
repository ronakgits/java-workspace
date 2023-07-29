
class A {
	
	void a() {
		
		System.out.println("This is a parent class");
	}
}

class B extends A {
	
	void b() {
		
		System.out.println("This is a child class");
	}
}

public class Ex24 {
	
	public static void main(String[] args) {
		
		A objA = new A(); 
		B objB = new B();
		
		objA.a();
		objB.b();
		objB.a(); 
	}
}