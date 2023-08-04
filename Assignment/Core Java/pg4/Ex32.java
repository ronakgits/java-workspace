public class Ex32 {

    public static long findFactorial(int n) {

        if (n == 0 || n == 1) {

            //  factorial of 0 and 1 is 1
            return 1; 
        
        } else {

            long factorial = 1;
            
            for (int i = 2; i <= n; i++) {

                factorial *= i;
            }
            return factorial;
            
        }
    }
    
    public static void main(String[] args) {

        int num = 5; 

        long factorial = findFactorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
