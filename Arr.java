import java.util.Scanner;

public class Arr {
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
        for(int[] ele:arr){
            for(int e:ele){
                System.out.print(e);
            }
            System.out.println();
        }
    }
}
