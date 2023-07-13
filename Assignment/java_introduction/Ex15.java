import java.util.Scanner; 

public class Ex15 {
    public static void main(String[] f) 
    {
        
        Scanner sc = new Scanner(System.in); 

        int n1=0, n2=1, n3, i, num; 

        System.out.print("Enter Number : ");
        num = sc.nextInt(); 

        System.out.print(n1 + " " + n2);

        for(i=2; i<num; i++)   
        {
            n3 = n1 + n2; 
            System.out.print(" " + n3);
            n1 = n2; 
            n2 = n3; 
        }
    }    
}

