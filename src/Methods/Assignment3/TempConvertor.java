package Methods.Assignment3;
/*5. Take as input the following
a. Minimum Fahrenheit value
b. Maximum Fahrenheit value
c. Step
Print as output the Celsius conversions. Use the formula C = (5/9)(F – 32)
e.g. for an input of 0, 100 and 20 the output is
0  -17
20  -6
40  4
60  15
80  26
100  37*/

import java.util.Scanner;

public class TempConvertor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter minimum farhenite value");
        int minf = s.nextInt();
        System.out.println("Enter maximum farhenite value");
        int maxf = s.nextInt();
        System.out.println("Enter step size");
        int step = s.nextInt();
        tempConversion(minf,maxf,step);
    }
    public static void tempConversion(int minf,int maxf,int step){
        for (int i = minf; i <=maxf ; i+=step) {
            int c = (5*(i-32))/9;
            System.out.println(c);
        }
    }
}
