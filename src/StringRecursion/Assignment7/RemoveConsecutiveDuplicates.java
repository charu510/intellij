package StringRecursion.Assignment7;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        remove("",str);
    }
    public static void remove(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if(unprocessed.length()>1){
            if(ch==unprocessed.charAt(1))
                remove(processed,unprocessed.substring(1));
            else
                remove(processed+ch,unprocessed.substring(1));
        }
        else{
            remove(processed+ch,unprocessed.substring(1));
        }
    }
}
