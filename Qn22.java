import java.util.Scanner;
public class Qn22 {
    static boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        while (num % 2 == 0) num /= 2;
        while (num % 3 == 0) num /= 3;
        while (num % 5 == 0) num /= 5;
        return num == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isUgly(num) ? "YES" : "NO");
    }

}
