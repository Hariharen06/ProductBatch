import java.util.*;
public class next {
    static void leapYear(){
        int year = 2400;
        if((year % 4 ==0 && year % 100 !=0) || (year % 400 ==0)){
            System.out.println("Year is a leap year");
        }
        else
            System.out.println("not a leap year");
    }
    static void addAndSum(){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int add = n+m;
        int sub = m-n;
        add = add<0 ? add*-1 : add;
        sub = sub<0 ? sub*-1 : sub;
        System.out.println(add + " " + sub);

    }
    static void tcs(int num,char c){
        if(num <= 7000 && num>0){
            if (c == 'h' && num <= 7000){
                if(4000>num)
                    System.out.println("time 45 min");
                else if (num <= 4000 && num > 2000) {
                    System.out.println("time 35 min");
                }
                else if (num <= 2000)
                    System.out.println("time 25 min");

            }
            else if (c == 'm' && 4000 <= num && num >= 2001)
                if (num <= 4000 && num > 2000) {
                    System.out.println("time 35 min");
                }
                else if (num <= 2000)
                    System.out.println("time 25 min");

                else if (c == 'l' && num <= 2000 && num >= 1)
                    System.out.println("Time 25 min");

                else
                    System.out.println("Overload");
        }
        else if (num == 0 ){
            System.out.println("0 min");
        }
        else {
            System.out.println("Invalid");
        }
    }
    static void switchExample(){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        char c = sc.nextLine().charAt(0);
        switch (c){
            case '+' :
                System.out.println(m+n);
            case '-' :
                System.out.println(m-n);
            case '*' :
                System.out.println(m*n);
            case '/' :
                System.out.println(m/n);
        }

    }
    static void caseMatch(){
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        if(c>='a' && c<='z'){
            System.out.println("Lower case");
        }
        if(c>='A' && c<='Z'){
            System.out.println("Upper case");
        }
        if((c=='a'||c=='e'||c=='i'||c=='o'||c=='u')||(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')){
            System.out.println("Vowel");
        }
        else System.out.println("Consonant");
    }
    static void electricityBill(){
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        if(unit<=50)
            System.out.println((unit*0.50)+(unit*0.50)*0.20);
        else if
            (unit>50 && unit<=150)System.out.println((25+((unit-50)*0.75))+(25+((unit-50)*0.75))*0.2);
        else if
            (unit>150 && unit<=250)System.out.println((25+75+((unit-150)*1.2))*0.2+(25+75+((unit-150)*1.2))*0.2);
        else
            System.out.println((25+75+120+((unit-250)*1.5)*0.2)+(25+75+120+((unit-250)*1.5)*0.2));

    }
    static void patt(){
        int n = 5;
        int f = 0;
        for(int i=1; i<=n; i++,System.out.println()) {
            f = i;
            for(int j=n; j>=i; j--) {
                if (j==n) System.out.printf("%d ",i);
                else System.out.printf("%d ",f);
                f+=j;
            }
        }
     }
    static void arrSum(int size){
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    static void oddEve(int size){
        int odd=0,even=0;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                even++;
            }
            else
                odd++;
        }
        System.out.println("ODD:"+odd);
        System.out.println("EVEN:"+even);
    }
    static void leftSum(int size){
        Scanner sc = new Scanner(System.in);
        int prev =0;
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            int temp = arr[i];
            arr[i] = prev;
            prev+=temp;
        }
        System.out.println(Arrays.toString(arr));

    }
    static void allSum(int size){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            sum += arr[i];
        }
        for(int i=0;i<size;i++){
            arr[i] = sum - arr[i];
            System.out.print(arr[i] +" ");
        }

    }
    static void allSum2(int size){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            sum += arr[i];
        }
        for(int i=0;i<size;i++){
            arr[i] = sum - arr[i];
            sum = arr[i];
            System.out.print(arr[i] +" ");
        }

    }
    static void majorityElement(){
        Scanner si = new Scanner(System.in);
        int k = si.nextInt();
        int l = k / 2;
        int size = 0;
        if (k % 2 == 0) {
            size = k / 2;
        } else {
            size = (k / 2) + 1;
        }
        int arr[] = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = si.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] == arr[i + l]) {
                System.out.println("Majority Element" +" "+ arr[i]);
                return;
            }
        }
        System.out.println("There is no Majority Element");
    }
    static void count01(int size){
        int arr[] = new int[size];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        int count0 = 0;
        int count1 = 0;
        for(int i=0; i<size;i++){
            if(arr[i]==0)
                count0++;
            else
                count1++;
        }
        System.out.println("cz:"+count0);
        System.out.println("co:"+count1);
    }
    static void arrMul(int size){
        int arr[] = new int[size];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        int prev = arr[0];
        for(int i=0;i<size;i++){
            int temp = arr[i];
            if(i==0)
                arr[i] = arr[i] * arr[i + 1];
            else if(i==size-1)
                arr[size-1]=arr[i]*arr[i-1];
            else
                arr[i]=prev*arr[i+1];
            prev = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void arrLar(int size){
        int arr[] = new int[size];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        int max = arr[0];
        for(int ele:arr){
            if(ele>max)
                max=ele;
        }
        System.out.println("Max element is "+max);
    }
    static void arrSma(int size){
        int arr[] = new int[size];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        int min = arr[0];
        for(int ele:arr){
            if(ele<min)
                min=ele;
        }
        System.out.println("Min element is "+min);
    }
    static void arrIns(int size){
        int arr[] = new int[size+1];
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        int ele = sc.nextInt();
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
        for(int i=size;i>=(pos-1);i--){
            arr[i]=arr[i-1];
            if(i==pos-1) {
                arr[pos-1] = ele;
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void arrUni(int size){
        int j;
        int arr[] = new int[size];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        for(int i = 0;i<size;i++){
            for(j = 0;j<size;j++){
                if(arr[i]==arr[j] && i!=j){
                    break;
                }
            }
            if(j==size){
                System.out.println("Unique Element : "+arr[i]);
            }
        }
    }
    public int[] twoSum ( int[] nums, int target){
            int arr[] = {5};
            arr = new int[]{5,6};
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < nums.length; i++)
                hm.put(nums[i], i);
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (hm.containsKey(complement) && i != hm.get(complement)) {
                    arr = new int[]{5};
                    return arr;
                }
            }
            return new int[]{};
        }
    static  void arrdel(int size){
        int[] arr=new int[size];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int pos = sc.nextInt();
        for(int i=pos-1;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        for(int i=0;i<size-1;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
/*
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 100 ==0)
        System.out.println("multiple of 100");
        leapYear();
        addAndSum();
        tcs(4500,'m');
        switchExample();
        electricityBill();
        System.out.println("hello");
        arrSum(5);
        oddEve(5);
        leftSum(5);
        allSum2(10);
        majorityElement();
        count01(5);
        arrMul(5);
        arrLar(5);
        arrIns(5);
        arrUni(5);
*/
//arrdel(5);
 arrUni(5);
    }
}
