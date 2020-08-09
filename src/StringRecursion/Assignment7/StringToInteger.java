package StringRecursion.Assignment7;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(convert(str));
    }
    public static int convert(String str){
        //if the length of string is 1
        if(str.length()==1){
            return(str.charAt(0)-'0');
        }
        //Recursive call for the substring
        //starting at second character
        double y = convert(str.substring(1));

        //first digit of the number
        double x = str.charAt(0)-'0';

        //first digit multiplied by the appropriate
        //power of 10 and then added recursively
       x=x*Math.pow(10,str.length()-1)+y;
       return (int)(x);
    }
}
