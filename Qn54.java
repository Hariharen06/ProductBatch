import java.util.Scanner;
class Qn54 {
    public static void findSpiralPosition(int steps) {
        int x = 0, y = 0;
        int dist = 10;
        int dir = 0; 

        for (int i = 0; i < steps; i++) {
            if (dir == 0) {
                x += dist;
            } else if (dir == 1) {
                y -= dist;
            } else if (dir == 2) {
                x -= dist;
            } else {
                y += dist;
            }
            dir = (dir + 1) % 4;
            dist += 10;
        }

        System.out.println("(" + x + "," + y + ")");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = scanner.nextInt();
        findSpiralPosition(steps);
    }
}