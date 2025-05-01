import java.util.Scanner;
class Qn25 {
    static boolean isTriangular(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i++;
        }
        return num == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isTriangular(num) ? "Triangular Number" : "Not a Triangular Number");
    }
}