import java.util.Scanner;
class Qn53 {
    public static void findAxisPosition(int x, int y) {
        if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (x == 0) {
            System.out.println(y > 0 ? "Positive Y-Axis" : "Negative Y-Axis");
        } else if (y == 0) {
            System.out.println(x > 0 ? "Positive X-Axis" : "Negative X-Axis");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        findAxisPosition(x, y);
    }
}