package Strings.Assignment5;



import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String str = "hello";
        duplicates("","hello");
    }
    public static void duplicates(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        if(unprocessed.length()>1){
            char ch = unprocessed.charAt(0);

            if(ch==unprocessed.charAt(1)){
                duplicates(processed,unprocessed.substring(1));
            }
            else{
                duplicates(processed+ch,unprocessed.substring(1));
            }
        }
        else{
            duplicates(processed+unprocessed.charAt(0),unprocessed.substring(1));
        }
    }

}
