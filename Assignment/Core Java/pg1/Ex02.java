import java.util.Scanner; 

public class Main {

    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter Character : "); 

        String str = sc.next().toLowerCase();
        
        // char ch = str.charAt(0); 

        if(str > 1) {

            System.out.println("ERROR: Enter only One Character");
        }
        else 
        {

            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
                    System.out.println(ch + " is vowel");
                else
                    System.out.println(ch + " is consonant");
            }
            else 
            {
                System.out.println("ERROR: String is not an Alphabet.");
            }
        }

    }
}
