package StringRecursion.Assignment7;

import java.util.Scanner;

public class NumberStringSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int num = Integer.parseInt(str);
        System.out.println(sum(num));
    }
    public static int sum(int num){
        if(num==0)
            return 0;
        return(num%10+sum(num/10));
    }


}
