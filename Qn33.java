import java.util.Scanner;
class Qn33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numStr = scanner.next();
        int[] freq = new int[10];
        for (char c : numStr.toCharArray()) {
            freq[c - '0']++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " occurs " + freq[i] + " times");
        }
    }
}