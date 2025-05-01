import java.util.Scanner;
class Qn46 {
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > 0; j--) {
                System.out.print(j > i ? n : (n - i));
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