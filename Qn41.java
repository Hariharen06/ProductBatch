import java.util.Scanner;
class Qn41 {
    public static void printPattern(int n) {
        int val, idcount;
        for (int row = 1; row <= 2 * n - 1; row++) {
            val = n;
            idcount = Math.min(row, 2 * n - row) - 1;
            for (int j = 1; j <= idcount; j++) {
                System.out.print(val--);
            }
            for (int k = 1; k <= 2 * n - 1 - 2 * idcount; k++) {
                System.out.print(val);
            }
            for (int l = 1; l <= idcount; l++) {
                System.out.print(++val);
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