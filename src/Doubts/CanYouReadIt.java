package Doubts;

import java.util.Scanner;

public class CanYouReadIt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        read(str);
    }
    public static void read(String str){
        String ans="";
        for (int i = 0; i <str.length() ; i++) {

            char ch=str.charAt(i);
            if(!uppercase(ch)){
                ans+=ch;
            }
            else{
                System.out.println(ans);
                ans="";
                ans=ans+ch;
            }

        }
        System.out.println(ans);


    }
    public static boolean uppercase(char ch){
        if(ch>='A' && ch<='Z')
            return true;
        return false;
    }
}
