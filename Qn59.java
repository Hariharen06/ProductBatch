import java.util.Scanner;
class Qn59 {
    public static void convertDaysToYearsWeeksDays(int totalDays) {
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int weeks = remainingDays / 7;
        int days = remainingDays % 7;

        System.out.println("Number of Years:" + years);
        System.out.println("Number of Weeks:" + weeks);
        System.out.println("Number of Days:" + days);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalDays = scanner.nextInt();
        convertDaysToYearsWeeksDays(totalDays);
    }
}

