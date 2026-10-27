import java.util.Scanner;

public class PPAP {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        for (;;) {
            System.out.println("Input a sentence in the form of I have a<object 1>, I have a < "
                + "object 2 >  to receive the next line of lyrics.");
            String a = in.nextLine();
            System.out.println(ppap(a));
            System.out.println();
        }
    }

    public static String ppap(String str) {
        String o1 = str.substring(9, str.indexOf(','));
        String o2 = str.substring(str.indexOf(',') + 11);
        String o3 = o2.substring(0, 1).toUpperCase();
        for (int i = 1; i < o2.length(); i++) {
            o3 = o3 + o2.charAt(i);
        }
        return "Uh! " + o3 + " " + o1 + ".";
    }
}
