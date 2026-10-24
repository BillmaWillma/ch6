import java.util.Scanner;

public class Doubloon {
    
    public static void main(String[] args){
       Scanner in = new Scanner(System.in) ;
        System.out.println("Input a word to see if it is a doubloon.") ;
        for(;;){
            String a = in.nextLine();
            if(a.length()==0){
                System.out.println("Please try again and put in some combination of letters.");
                System.out.println();
            } else{
                System.out.println(isDoubloon(a.toLowerCase()));
                System.out.println();
            }
        }
    }

    public static boolean isDoubloon (String s){
       int b = 0 ;
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            b = 0;
            for (int j=0; j<s.length(); j++){
                if(s.charAt(j)==c){
                    b++;
                }
            }
            if (b!=2){
                return false;
            }
     }
        return true;
    }
}
