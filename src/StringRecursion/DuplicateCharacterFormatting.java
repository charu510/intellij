package StringRecursion;

import java.util.Scanner;

public class DuplicateCharacterFormatting {
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
        if(unprocessed.length()>1){
            char ch = unprocessed.charAt(0);


            if(ch==unprocessed.charAt(1)){
                formatting(processed+ch+"*",unprocessed.substring(1));
            }
            else{
                formatting(processed+ch,unprocessed.substring(1));
            }
        }
        else{
            formatting(processed+unprocessed.charAt(0),unprocessed.substring(1));
        }
    }
}
