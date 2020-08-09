package Methods.Assignment3;

import java.util.Scanner;

/*Take sb (source number system base), db (destination number system base) and
sn (number in source format). Write a function that converts sn to its counterpart
in destination number system. Print the value returned.*/
public class GeneralizedNSConvertor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter source number system base");
        int sb= s.nextInt();
        System.out.println("Enter destination number system base");
        int db= s.nextInt();
        System.out.println("Enter number in source format");
        int sn= s.nextInt();
        System.out.println("The final result");
        System.out.println(conversion(sn,sb,db));
    }
    public static int conversion(int sn,int sb,int db){
        int dn = 0; //Destination number
        int place=1;

        while(sn>0){
            int r = sn%db;
            sn=sn/db;
            dn=dn+r*place;
            place=place*sb;
        }
        return dn;
    }
}
