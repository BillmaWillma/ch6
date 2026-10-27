import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (;;) {
            System.out.println("Input a word or a sentence to see if it is a Palindrome.");
            String a = in.nextLine();
            System.out.println(isPalindrome(a.toLowerCase()));
            System.out.println();
        }
    }

    public static boolean isPalindrome(String str) {
        String b = "";
        String c = "";
        String nonletter = ",.:;()[]{}!@#$%^&* ";
        for (int i = 0; i < str.length(); i++) {
            if (!str.substring(i, i + 1).contains(nonletter)) {
                b = b + str.charAt(i);
            } else {
                b = b + "";
            }
        }
        for (int i = str.length() - 1; i >= 0; i--) {
             if (!str.substring(i, i + 1).contains(nonletter)) {
            c = c + str.charAt(i);
		} else{
			c=c+"";
        }
	}
		System.out.println(b);
		System.out.println(c);
        return b.equals(c);
}
}
