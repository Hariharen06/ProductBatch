import java.util.Scanner;
class Qn36 {
    static boolean isMagicNumber(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        int reverse = 0, tempSum = sum;
        while (tempSum > 0) {
            reverse = reverse * 10 + tempSum % 10;
            tempSum /= 10;
        }
        return sum * reverse == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isMagicNumber(num) ? "Yes" : "No");
    }
}