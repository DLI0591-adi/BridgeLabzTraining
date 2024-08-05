package Day2;

import java.util.Scanner;

public class Operator_Programs {
    public static void main(String[] args) {
        as();
        mul();
        maxi();
        divv();
        compAss();
        pp();
        noo();
        bit();
        ov();
        pf();
    }

    public static void as(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        int diff = a-b;
        int summ = a+b;
        System.out.println("The sum of two numbers is: "+ summ);
        System.out.println("The difference of two numbers is: "+ diff);

    }
    public static void mul(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }

    }
    public static void pp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer");
        int n = sc.nextInt();
        System.out.println("Post increment "+ (n++));
        System.out.println("Pre increment "+ (++n));
    }

    public static void noo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a boolean: ");
        boolean b = sc.nextBoolean();
        System.out.println(!b);
    }
    public static void pf(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the student to check if pass or fail");
        int n = sc.nextInt();
        String b = n>40 ? "Pass" : "Fail";
        System.out.println(b);
    }
    public static void maxi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1rst number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number");
        int c = sc.nextInt();
        int maxx = a;
        if(a<b && b>c){
            maxx = b;
        }
        else if(c>b && c>a){
            maxx = c;
        }
        System.out.println("The maximum of three numbers is: "+ maxx);
    }
    public static void divv(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if(a%5==0 && a%7==0){
            System.out.println("The number is divisible both by 5 and 7");
        }
        else if(a % 5 == 0){
            System.out.println("The number is divisible by 5 but not 7");
        }
        else if (a % 7 == 0){
            System.out.println("The number is divisible by 7 but not 5");
        }
        else {
            System.out.println("The number is not divisible by both 5 and 7");
        }
    }
    public static void bit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(n<<1);
    }

    public static void compAss(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        a += b;
        System.out.println("The value of a after a+=b is "+ a);
        a -= b;
        System.out.println("The value of a after a-=b is "+ a);
        a /= b;
        System.out.println("The value of a after a/=b is "+ a);
        a*=b;
        System.out.println("The value of a after a*=b is "+ a);
        a %= b;
        System.out.println("The value of a after a%=b is "+ a);
    }
    public static void ov(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if its even or odd");
        int n = sc.nextInt();
        if((n&1) != 0){
            System.out.println("The number is a odd number");
        }
        else{
            System.out.println("The number is a even number");
        }
    }
}
