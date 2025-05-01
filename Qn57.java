import java.util.Scanner;
class Qn57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt(), month = scanner.nextInt();
        
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;

        for (int i = 1; i < month; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += day;
        
        System.out.println("Completed days: " + totalDays);
    }
}
