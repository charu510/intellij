package Strings.Assignment5;

import java.util.Scanner;

public class PalindromicSubstring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        substring(str);

    }
    public static void substring(String str){
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                if(palindrome(str.substring(i,j))==false)
                    continue;
                else
                    System.out.println(str.substring(i,j));

            }
        }
    }
    public static boolean palindrome(String str){
        int start=0;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

}
