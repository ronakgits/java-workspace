import java.util.Scanner; 

public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        int n1=0, n2=1, n3, i, num; 

        System.out.print("Enter Number : ");
        num = sc.nextInt(); 

        // 0 1 
        System.out.print(n1 + " " + n2);

        for(i=2; i<num; i++)   
        {
            n3 = n1 + n2; 
            System.out.print(" " + n3);
            // swap 
            n1 = n2; 
            n2 = n3; 
        }
    }    
}


/*  

Enter Number : 15
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377

*/