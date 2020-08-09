package Methods.Assignment3;

import java.util.Scanner;

public class UpperLowerCase{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = s.next().charAt(0);
        check(ch);
    }
    public static void check(char ch){
        if(ch>='A' && ch<='Z')
            System.out.println('U');
        else if(ch>='a' && ch<='z')
            System.out.println('L');
        else
            System.out.println('l');
    }
}
