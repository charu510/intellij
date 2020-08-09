package StringRecursion.Assignment7;

import java.util.Scanner;

public class DuplicateFormatting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        formatting("",str);
    }
    public static void formatting(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if(unprocessed.length()>1){
            if(ch==unprocessed.charAt(1))
                formatting(processed+ch+"*",unprocessed.substring(1));
            else
                formatting(processed+ch,unprocessed.substring(1));
        }
        else{
            formatting(processed+ch,unprocessed.substring(1));
        }
    }
}
