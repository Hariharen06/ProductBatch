import java.util.Scanner;

public class Arr2DZeroes {
    static int arrZeroes(int arr[][],int row,int col){
        int max=0;
        int curr=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j]==0)
                    curr++;
            }
            if(curr>max){
                max=i;
                curr=0;
            }
        }
        return max;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(arrZeroes(arr,row,col));
    }
}
