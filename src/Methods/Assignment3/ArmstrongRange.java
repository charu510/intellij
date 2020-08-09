package Methods.Assignment3;

/*Take as input two numbers N1 and N2. Write a function to print all Armstrong
        numbers between N1 and N2.*/

import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the lower range");
        int n1 = s.nextInt();
        System.out.println("Enter the upper range");
        int n2 = s.nextInt();
        ArmstrongRange(n1,n2);
        }
        public static void ArmstrongRange(int n1,int n2) {
            for (int i = n1; i <= n2; i++) {
                if (ArmstrongNumber.Armstrong(i) == i) //Reference to the Armstrong number created in
                                                        //another class called "ArmstrongNumber".
                    System.out.println(i);

            }
        }

}
