import java.util.Scanner;
class Qn34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int n = scanner.nextInt();
        String numStr = String.valueOf(num);
        n = n % numStr.length(); 
        String rotated = numStr.substring(n) + numStr.substring(0, n);
        System.out.println(rotated);
    }
}