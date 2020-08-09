package Strings.Assignment5;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(str);
        System.out.println(palindrome(str));
    }
    public static boolean palindrome(String str){
        int start=0;
        int end=str.length()-1;
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
