package StringRecursion.Assignment7;


import java.util.Scanner;

public class CheckReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        System.out.println(check(str2,reverse("",str1)));

    }
    public static String reverse(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            return processed;
        }
        char ch = unprocessed.charAt(unprocessed.length()-1);

        return reverse(processed+ch,unprocessed.substring(0,unprocessed.length()-1));
    }
    public static boolean check(String str2,String processed){
        if(str2.equals(processed))
            return true;
        return false;
    }


}
