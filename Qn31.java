import java.util.Scanner;
class Qn31 {
    static boolean isKaprekar(long num) {
        if (num == 1) {
            return true;
        }
        long square = num * num;
        String sqStr = String.valueOf(square);
        int len = sqStr.length();
        for (int i = 1; i < len; i++) {
            long right = Long.parseLong(sqStr.substring(len - i));
            if (right == 0) {
                continue;
            }
            long left = Long.parseLong(sqStr.substring(0, len - i));
            if (left + right == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        System.out.println(isKaprekar(num) ? "YES" : "NO");
    }
}