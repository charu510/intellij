package Strings.Assignment5;

import java.util.Scanner;

public class OddEvenPlace {
    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);
        String str = "bat";
        System.out.println(oddeven(str));
    }
    public static StringBuilder oddeven(String str){
        StringBuilder builder = new StringBuilder(str);
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            int index = str.indexOf(ch);
            if(index%2==0)
                ch = (char)(ch-1);
            else
                ch=(char)(ch+1);
            builder.setCharAt(i,ch);
        }
        return builder;
    }
}
