package Methods.Assignment3;
/*3. Take N (number in octal format). Write a function that converts it to binary
format. Print the value returned.*/

import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an octal number");
        int n = s.nextInt();
        System.out.println(OctToBin(n));

    }
    public static int OctToBin(int oct){
        //First converting octal into decimal
        int deci = 0;
        int place = 1;

        while(oct>0){
            int r = oct%10;
            oct=oct/10;
            deci=deci+r*place;
            place=place*8;
        }
       //Now converting decimal into binary
        int bin=0;
        int p=1; //Denoting place

        while(deci>0){
            int rem = deci%2;
            deci=deci/2;
            bin=bin+rem*p;
            p=p*10;
        }
        return bin;
    }
}
