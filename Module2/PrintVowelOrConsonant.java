
public class PrintVowelOrConsonant {

    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter Character : "); 

        String str = sc.next().toLowerCase();
        
        char ch = str.charAt(0); 

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
            
    }
}
