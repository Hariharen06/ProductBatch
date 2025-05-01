import java.util.Scanner;
class Qn39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numStr = scanner.next();
        for (char c : numStr.toCharArray()) {
            int digit = c - '0';
            if (digit != 0 && Integer.parseInt(numStr) % digit == 0) {
                System.out.println(digit);
                return;
            }
        }
        System.out.println(-1);
    }
}

