public class Ex19 {

    static void printInterLeaving(String s1, int i, 
                                  String s2, int j, 
                                  String res) {

        if(i == s1.length() && j == s2.length()) {
            System.out.println(res);
        }

        if(i < s1.length()) {
            printInterLeaving(s1, i+1, s2, j, res + s1.charAt(i));
        }

        if(j < s2.length()) {
            printInterLeaving(s1, i, s2, j+1, res + s2.charAt(j));
        }
    }

    public static void main(String[] args) {
        
        // String 1
        String s1 = "AB";   
        
        // String 2
        String s2 = "CD";

        printInterLeaving(s1, 0, s2, 0, "");


    }
}



