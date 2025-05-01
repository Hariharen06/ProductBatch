import java.util.Scanner;

public class Identity {
    static void iden(int[][] arr,int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j&&arr[i][j]!=1){
                    System.out.println("Not Identity");
                    return;
                }
                if(i!=j&&arr[i][j]!=0){
                    System.out.println("Not Identity");
                    return;
                }
            }
        }
        System.out.println("Identity");
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
        iden(arr,row,col);

    }
}
