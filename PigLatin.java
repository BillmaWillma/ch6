import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (;;) {
            System.out.println(
                "Input a sentence containing only letters and spaces to translate into pig latin.");
            String a = in.nextLine();

            System.out.println(pigLatin(a));
            System.out.println();
        }
    }

    public static String pigLatin(String msg) {
        String c = "";
        int d = 0;
        for (int i = 0; i < msg.length(); i++) {
            if (msg.charAt(i) == ' ' && i>d) {
                    c = c + translate(msg.substring(d, i)) + " ";
                    d=i;
            }
        }
        return c;
    }

    public static String translate(String s) {
        String b = "";
        if (s.length() <= 2) {
            b = b;
        }
        if (s.length() > 2) {
            for (int i = 1; i < s.length(); i++) {
                b = b + s.charAt(i);
            }
            b = b + s.charAt(0) + "ay";
        }
        return b;
    }
}
