import java.util.Scanner;
class Qn26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println("Perfect Number");
        } else if (sum > num) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Deficient Number");
        }
    }
}