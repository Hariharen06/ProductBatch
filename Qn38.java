import java.util.Scanner;
class Qn38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();
        System.out.println(hexadecimal);
    }
}