import java.util.Scanner;

public class Scrabble {
    
    public static void main(String[] args){
       Scanner in = new Scanner(System.in) ;
        System.out.println("Input two strings, the first for the letters you have and the second for the word you wish to create with those letters, to see if you could make the word.");
        for(;;){
            String a = in.nextLine();
            String b = in.nextLine();
            if (a.length()==0||b.length()==0){
                System.out.println("Please make sure that each string contains atleast one letter.");
                System.out.println();
            } else {
                System.out.println(canSpell(a.toLowerCase(), b.toLowerCase()));
                System.out.println();
            }
        }
    }

    public static boolean canSpell (String s, String w){
        int d=0;
        int e=0;
        for (int i=0; i<w.length(); i++){
           char c = w.charAt(i);
            d=0;
            e=0;
            for (int j=0; j<s.length(); j++){
                if(s.charAt(j)==c){
                    d++;
                }
            }
            for(int j=0; j<w.length(); j++){
                if(w.charAt(j)==c){
                    e++;
                }
            }
            if (d<e){
                return false;
            }
        }
        return true;
    }
    
}
