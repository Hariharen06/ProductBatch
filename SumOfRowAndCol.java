import java.util.Scanner;

public class SumOfRowAndCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int rowSum=0,colSum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                rowSum+=arr[i][j];
                colSum+=arr[j][i];
            }
            System.out.println(i+" th row "+rowSum);
            System.out.println(i+" th col "+colSum);
            rowSum=0;
            colSum=0;
        }
    }
}
