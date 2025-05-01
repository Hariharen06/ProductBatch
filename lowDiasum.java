import java.util.Scanner;

public class lowDiasum {
    public static void diaSum(int arr[][]) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if(i+j >= arr.length-1) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n=sc.nextInt();
        int arr[][] = new int[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        diaSum(arr);
    }
}
