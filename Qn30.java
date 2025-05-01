import java.util.Scanner;
class Qn30 {
    static int sumOfDivisors(int num) {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        return sum;
    }

    static boolean isBetrothed(int num1, int num2) {
        return sumOfDivisors(num1) == num2 + 1 && sumOfDivisors(num2) == num1 + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (isBetrothed(i, j)) {
                    System.out.print(i + "," + j + " ");
                }
            }
        }
        System.out.println();
    }
}