package Strings;


import java.util.Scanner;

public class StringBuildereg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        toggle("ChArU");


    }
    public static StringBuilder toggle(String str){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch=(char)('a'+(ch-'A'));
            }
            else
                ch=(char)('A'+(ch-'a'));
            builder.setCharAt(i,ch);
        }
        return builder;
    }


}
