import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (;;) {
            System.out.println("Input a positive integer to be converted into binary.");
            int a = in.nextInt();
            if (a <= 0) {
                System.out.println("Please try again and input a positive integer.");
                System.out.println();
            } else {
                System.out.println(convertToBinary(a));
                System.out.println();
            }
        }
    }

    public static String convertToBinary(int num) {
        String b = "";
        String c = "";
        int i = num;
        while (i > 0) {
            b = b + i % 2;
            i /= 2;
        }
        for (int j = b.length() - 1; j >= 0; j--) {
            c = c + b.charAt(j);
        }
        return c;
    }
}
