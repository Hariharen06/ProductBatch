import java.util.Scanner;

public class Boundary {
    public static void sup(int arr[][]) {
        //UpperBoundary
        System.out.print("UPPER BOUNDARY : ");
        for(int j=0; j<arr[0].length; j++) {
            System.out.print(arr[0][j] + " ");
        }
        System.out.println();
        //BottomBoundary
        System.out.print("BOTTOM BOUNDARY : ");
        for(int j=0; j<arr[0].length; j++) {
            System.out.print(arr[arr.length-1][j] + " ");
        }
        System.out.println();
        System.out.print("LEFT BOUNDARY: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i][0]+ " ");
        }
        System.out.println();

        System.out.print("RIGHT BOUNDARY : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i][arr[0].length-1]+ " ");
        }
        System.out.println();
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
        sup(arr);
    }
}
