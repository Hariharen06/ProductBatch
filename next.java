import java.util.Scanner;

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
            for(int j=n; j>=1; j--) {
                if (j==n)
                    System.out.print(i);
                else
                    System.out.print(f);
                f+=j;

            }
        }
     }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        if(num % 100 ==0)
//            System.out.println("multiple of 100");
//        leapYear();
//        addAndSum();
//        tcs(4500,'m');
//        switchExample();
//        electricityBill();
  //       System.out.println("hello");
        patt();


    }
}
