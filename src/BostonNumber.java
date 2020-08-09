import java.util.Scanner;

public class BostonNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(digitSum(n));
        System.out.println(factorsum(n));
    }
    public static int digitSum(int n){
        int sum1=0;
        while(n>0){
            int rem = n%10;
            sum1 = sum1+rem;
            n=n/10;
        }
        int sum4=0;
        while(sum1>0){
            int re = sum1%10;
            sum4 = sum4+re;
            sum1=sum1/10;
        }
        return sum4;
    }
    public static int factorsum(int n){
        int sum2=0;
        for (int i = 2; i <=n ; i++) {
            while(n%i==0){
                sum2=sum2+i;
                n=n/i;
            }
        }
        int sum3=0;
        while(sum2>0){
            int r = sum2%10;
            sum3=sum3+r;
            sum2=sum2/10;
        }
        int sum5=0;
        while(sum3>0){
            int r = sum3%10;
            sum5=sum5+r;
            sum3=sum3/10;
        }
        return sum5;
    }

}


