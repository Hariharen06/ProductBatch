import java.util.Scanner;
class Qn58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt(), month = scanner.nextInt();
        
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0, daysPassed = 0;

        for (int i = 1; i < month; i++) {
            daysPassed += daysInMonth[i];
        }
        daysPassed += day;
        totalDays = 365 - daysPassed;

        System.out.println(totalDays);
    }
}