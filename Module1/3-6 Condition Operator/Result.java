public class Result {

    public static void main(String[] args) {
        
        int s1 = 80, s2 = 70, s3 = 90, s4 = 80, s5 = 80;
        int sum; 
        int total = 500;  
        double percentage; 

        sum = s1 + s2 + s3 + s4 + s5; 
        
        System.out.println("Sum : " + sum);

        percentage = (sum * 100)/total; 

        System.out.println("Percentage : " + percentage);

    }
    
}
