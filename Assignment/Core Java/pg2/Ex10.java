import java.util.Scanner;  

public class Ex10 {

    public static void main(String args[]) {  
        
        Scanner sc = new Scanner(System.in);  
        
        System.out.print("Enter a character: ");  
        char chr = sc.next().charAt(0);  
        
        int asciiValue = chr;  
        
        System.out.println(" ASCII value of " + chr + " is : " + asciiValue);  
    }  
}
