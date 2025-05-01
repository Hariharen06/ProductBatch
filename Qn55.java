import java.util.Scanner;
class Qn55 {
    public static void findVerticalPosition(int steps, String direction) {
        int y = direction.equalsIgnoreCase("T") ? steps : -steps;
        System.out.println("(0," + y + ")");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = scanner.nextInt();
        String direction = scanner.next();
        findVerticalPosition(steps, direction);
    }
}

