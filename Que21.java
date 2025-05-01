import java.util.Scanner;
class Que21 {
    static int countTrailingZeros(int num) {
        int count = 0;
        while (num > 0) {
            num /= 5;
            count += num;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(countTrailingZeros(num));
    }
}