package StringRecursion;

import java.util.Scanner;

public class Subsequence {
    public static int count=0;
    public static void main(String[] args) {
        count=0;

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0) {
            count=0;
            String str = s.next();
            subsequences("",str,count);
            System.out.println(count);
        }
    }
    public static void subsequences(String processed,String unprocessed,int count){
        if(unprocessed.length()==0){
            char ch1 = unprocessed.charAt(0);
            if(ch1!=unprocessed.charAt(1)){
                subsequences(processed+ch1,unprocessed.substring(1),count+1);
            }
            else{
                subsequences(processed,unprocessed.substring(1),count);
            }
            return;
        }
    }
}