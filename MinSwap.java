public class MinSwap {
    static int swap(int arr[],int k){
        int counter=0;
        for(int l=0,r=arr.length-1;l<r;l++,r--){
            while(arr[l]<=k) l++;
            while(arr[r]>k) r--;
            if(l<r) counter++;

        }
        return counter;
    }

    public static void main(String[] args) {

    }
}
