import java.util.Arrays;
import java.util.Scanner;

public class Arr2DIden {
    static boolean isIdentical(int[][] arr , int[][] arr2,int row1,int col2){
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                if(arr[i][j] != arr2[i][j]) {
                    System.out.println("Non Identical" + arr[i][j] + " " + arr2[i][j]);
                    return false;
                }
            }
        }
        System.out.println("Identical");
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 2;
        int col = 2;
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int row1 = 2;
        int col2 = 2;
        int[][] arr2 = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr2));
        if(isIdentical(arr,arr2,row1,col2)){
            System.out.println("Identical");
        }
        else
            System.out.println("Non Identical");

    }
}

