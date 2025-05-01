import java.util.Scanner;
class Qn37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numStr = scanner.next();
        int evenProduct = 1, oddSum = 0;

        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';
            if ((numStr.length() - i) % 2 == 0) {
                evenProduct *= digit;
            } else {
                oddSum += digit;
            }
        }

        if (oddSum == 0) {
            System.out.println("No");
        } else if (evenProduct % oddSum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}