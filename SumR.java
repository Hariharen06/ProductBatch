import java.util.Scanner;

public class SumR {
    static int MaxRot(int [] arr,int size){
        int sum=0;
        int prev=0;
        int next = 0,max=0;
        int temp = arr[size-1];
        for(int k=0; k<size;k++) {
            for(int i=size-1;i>=0;i--){
                if(i==0){
                    arr[i]=temp;
                    for(int j=0;j<size;j++){
                        sum += j*arr[j];
                    }
                    if(sum > max) {
                        max = sum ;
                    }
                    sum = 0;
                    temp=arr[size-1];
                }
                else
                    arr[i]=arr[i-1];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.println(MaxRot(arr,size));
    }
}
