package Networks_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the entries");
        int n = s.nextInt();
        int m = s.nextInt();
        int l = s.nextInt();
        int temp[] = add(n,m,l);


    }
    public static int[] add(int b1,int b2,int b3){
        int i=0,remainder=0;
        int[] sum = new int[8];
        while(b1!=0 || b2!=0){
            sum[i++] = ((b1%10+b2%10+b3%10+remainder)%2);
            remainder = ((b1%10+b2%10+b3%10+remainder)/2);
            b1=b1/10;
            b2=b2/10;
            b3=b3/10;
        }
        if(remainder!=0){
            sum[0] += remainder;
        }

        --i;
        System.out.println("The sum is:");
        while(i>=0){
            System.out.print(sum[i--]);
        }
        System.out.println();
        return sum;

        }


}









