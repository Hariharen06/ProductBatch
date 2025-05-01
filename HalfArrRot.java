import java.util.Arrays;
public class HalfArrRot {
    static void halfRot(int arr[],int n){
        int rotSize = arr.length/2;
        while(n>0){
            for(int i=arr.length-1;i>rotSize;i--){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
            n--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        halfRot(arr,5);
    }
}
