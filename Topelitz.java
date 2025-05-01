import java.util.Scanner;

public class Topelitz {
    static void tope(int[][] arr,int row,int col){
        int val=arr[0][0];
        int flag=1;
        for(int i=0;i<row-1;i++){
            for(int j=0;j<col-1;j++){
                if(arr[i][j]!=arr[i+1][j+1]){
                    System.out.println("Not a Toeplitz");
                    flag=0;
                    break;
                }
            }
        }
        if(flag==1)
            System.out.println("Topelitz");
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        tope(arr,row,col);
    }
}
