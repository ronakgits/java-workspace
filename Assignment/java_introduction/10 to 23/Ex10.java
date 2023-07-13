public class Ex10 {
    
    public static void main(String[] a) {

        int num = 7, count = 0;

        for(int i=1; i<=num; i++)
        {
            if(num % i == 0)
            {
                count++;
            }
        }

        if(count == 2)
            System.out.println(num + " is Prime Number.");
        else 
            System.out.println(num + " is Not Prime Number.");
    }
}
