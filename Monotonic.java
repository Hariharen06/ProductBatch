import java.util.Scanner;

public class Monotonic {
    static boolean incr(int arr[],int size){
            boolean flag = true;
                for(int i=0;i<size-2;i++){
                    if(arr[i]<arr[i+1]){
                        flag=false;
                    }
                }
                return flag;
    }
    static boolean dec(int arr[],int size){
        boolean flag = true;
        for(int i=0;i<size-2;i++){
            if(arr[i]>arr[i+1]){
                flag=false;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        if(incr(arr,size)||dec(arr,size)){
            System.out.println("Array is Monotonic");
        }
        else{
            System.out.println("Array is Non Monotonic");
        }
    }
}
