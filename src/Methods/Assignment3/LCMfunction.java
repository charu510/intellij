package Methods.Assignment3;

/*Take as input two numbers N1 and N2. Write a function which calculates and
        returns the LCM of two numbers. Print the value returned.*/

import java.util.Scanner;

public class LCMfunction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = s.nextInt();
        System.out.println("Enter the second number");
        int n2 = s.nextInt();
        System.out.println(LCM(n1,n2));

    }
    public static int LCM(int n1,int n2){
        int gcd=0;
        int lcm;
        for (int i =1; i<=n1 && i <=n2 ; i++) {
            if(n1%i==0 && n2%i==0)
                gcd=i;
        }
        lcm = (n1*n2)/gcd;
        return lcm;
    }

}
