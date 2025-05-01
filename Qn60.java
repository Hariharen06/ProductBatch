import java.util.Scanner;
class Qn60 {
    static int countDays(int d, int m, int y) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = d + (y * 365); 
        for (int i = 1; i < m; i++) {
            totalDays += daysInMonth[i]; 
        }
        totalDays += countLeapYears(y, m); 
        return totalDays;
    }
    static int countLeapYears(int y, int m) {
        if (m <= 2) y--; 
        return y / 4 - y / 100 + y / 400; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d1 = scanner.nextInt(), m1 = scanner.nextInt(), y1 = scanner.nextInt();
        int d2 = scanner.nextInt(), m2 = scanner.nextInt(), y2 = scanner.nextInt();
        int days1 = countDays(d1, m1, y1);
        int days2 = countDays(d2, m2, y2);
        System.out.println(Math.abs(days2 - days1));
    }
}