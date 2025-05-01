import java.util.Scanner;
class Qn47 {
    public static void printPattern(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(num++ + " ");
                }
            } else {
                num = num + i - 1;
                for (int j = i; j >= 1; j--) {
                    System.out.print(num-- + " ");
                }
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printPattern(n);
    }
}