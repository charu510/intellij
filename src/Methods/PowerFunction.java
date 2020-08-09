package Methods;

/*. Take as input two numbers x and n. Write a function which calculates and returns
the xn. Print the value returned.*/

import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the base");
        int x = s.nextInt();
        System.out.println("Enter the exponent");
        int n = s.nextInt();
        System.out.println(power(x,n));

    }
    public static int power(int x,int n){
        int temp;
        if(n==0)
            return 1;
        temp=power(x,n/2);
        if(n%2==0)
            return temp*temp;
        else
            return x*temp*temp;
    }
}
