import java.util.Scanner;

public class Abecedarian {
    
    public static void main(String[] args){
       Scanner in = new Scanner(System.in) ;
        System.out.println("Input a word to see if it is abecedarian.") ;
        for(;;){
            String a = in.nextLine();
            if(a.length()==0){
                System.out.println("Please try again and put in some combination of letters.");
                System.out.println();
            } else{
            System.out.println(isAbecedarian(a.toLowerCase()));
            System.out.println();
            }
        }
    }

    public static boolean isAbecedarian (String s){
        for (int i=0; i<s.length()-1; i++){
            if(s.charAt(i)>=s.charAt(i+1)){
                return false ;
            }
        }
        return true;
    }
    
}
