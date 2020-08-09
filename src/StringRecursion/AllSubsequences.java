package StringRecursion;

import java.util.Scanner;

public class AllSubsequences {
    public static int count=0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //int t = s.nextInt();
        count=0;
        String str = s.nextLine();
        System.out.println(subsequences("",str));


    }
    public static int subsequences(String processed,String unprocessed){
        if(unprocessed.length()==1){
            count++;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        subsequences(processed,unprocessed);
        subsequences(processed+ch,unprocessed);

        return count;
    }
}
