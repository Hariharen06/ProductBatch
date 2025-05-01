import java.util.Arrays;

public class ArrSeg {
    static void arrSeg(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1&&arr[i]%2==0) break;
            if(arr[i]%2==0){
                if(arr[i+1]%2==0) continue;
                for(int j=arr.length-1;j>0;j--){
                    if(arr[j]%2!=0){
                        int temp = arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                        break;
                    }
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr={5,8,7,3,9,1,4};
        arrSeg(arr);
    }
}
