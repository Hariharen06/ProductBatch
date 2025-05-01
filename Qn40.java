import java.util.Scanner;
public class Qn40 {
    public static String swapDigits(String numStr, int pos1, int pos2) {
        char[] digits = numStr.toCharArray();
        char temp = digits[digits.length - pos1];
        digits[digits.length - pos1] = digits[digits.length - pos2];
        digits[digits.length - pos2] = temp;
        return new String(digits);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numStr = scanner.next();
        int pos1 = scanner.nextInt();
        int pos2 = scanner.nextInt();
        System.out.println(swapDigits(numStr, pos1, pos2));
    }

}
