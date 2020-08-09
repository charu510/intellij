package Strings.Assignment5;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(toggle(str));
    }
    public static StringBuilder toggle(String str){
        StringBuilder builder = new StringBuilder(str);
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);

            if(ch>='a' && ch<='z')
                ch = (char)('A'+(ch-'a'));
            else
                ch = (char)('a'+(ch-'A'));
            builder.setCharAt(i,ch);
        }
        return builder;
    }
}
