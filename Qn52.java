import java.util.Scanner;
class Qn52 {
    public static void calculateVerticalPosition(int time) {
        int y = 2 * time;
        System.out.println("(0 , " + y + ")");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        calculateVerticalPosition(time);
    }
}