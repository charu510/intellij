package Doubts;

import java.util.Scanner;

public class RecursionSubsequences {
    public static int count=0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        count=0;
        subsequences("",str);
        System.out.println(count);
    }
    public static void subsequences(String processed,String unprocessed){
        if(unprocessed.length()==1){
            count++;
            System.out.println(processed+unprocessed);
            return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        subsequences(processed+ch,unprocessed);
        subsequences(processed,unprocessed);
    }
}
