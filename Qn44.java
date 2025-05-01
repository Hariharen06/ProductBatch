import java.util.Scanner;
class Qn44 {
    public static void printPattern(int n) {
        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val--);
            }
            for (int k = 1; k <= n - i; k++) {
                System.out.print(val);
            }
            val = i + 1;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printPattern(n);
    }
}