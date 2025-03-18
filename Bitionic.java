public class Bitionic {
    static void btonic(int arr[]){
       boolean increase = true;
       boolean decrease = false;
       for(int i = 0;i<arr.length-1;i++){
           if(arr[i]>arr[i+1]){
               if(!decrease){
                   decrease=true;
               }
           }
       }
    }
}
