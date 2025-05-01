import java.util.Scanner;
class Qn56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt(), m1 = scanner.nextInt(), s1 = scanner.nextInt();
        int h2 = scanner.nextInt(), m2 = scanner.nextInt(), s2 = scanner.nextInt();
        
        int time1 = h1 * 3600 + m1 * 60 + s1;
        int time2 = h2 * 3600 + m2 * 60 + s2;
        
        System.out.println(Math.abs(time2 - time1));
    }
}

