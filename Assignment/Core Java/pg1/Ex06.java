public class Ex06 {

    public static void main(String[] args) {
        
        int row, column, num = 5; 
        
        for(row = 1; row <= num; row++) {

            for(column = 1; column <= row; column++) {
                
                System.out.print(column + " ");
            }
            
            System.out.println();
        }
    }
}
