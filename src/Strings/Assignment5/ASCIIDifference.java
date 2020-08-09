package Strings.Assignment5;

public class ASCIIDifference {
    public static void main(String[] args) {
        String str = "acb";
        difference("",str);

    }
    public static void difference(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        if(unprocessed.length()>1){
            char ch = unprocessed.charAt(0);
            difference(processed+ch+(unprocessed.charAt(1)-ch),unprocessed.substring(1));
        }
        else
            difference(processed+unprocessed.charAt(0),unprocessed.substring(1));
    }
}
