import java.util.Scanner;
class Qn51 {
    public static void findFinalPosition(int steps, String direction) {
        int x = 0, y = 0;
        if (direction.equalsIgnoreCase("R")) {
            x = steps;
        } else if (direction.equalsIgnoreCase("L")) {
            x = -steps;
        }
        System.out.println("(" + x + "," + y + ")");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = scanner.nextInt();
        String direction = scanner.next();
        findFinalPosition(steps, direction);
    }
}