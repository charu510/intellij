package Recursion.BasicAssignment1;

import java.util.Arrays;

public class Lexopermutations {
    public static void main(String[] args) {
        String str="abc";
        int[] fre = new int[26];

        frequency(fre,str);
        lexoperm("",fre,str.length());
        //To display the characters corresponding to the given frequency
//        for (int i = 0; i <fre.length ; i++) {
//            if(fre[i]>0){
//                System.out.println((char)(i+'a'));
//            }
//        }
    }
    public static void lexoperm(String processed,int[] fre,int length){
        if(length==0){
            System.out.println(processed);
            return;
        }
        for (int i = 0; i <fre.length ; i++) {
            if(fre[i]>0){
                fre[i]--;
                lexoperm(processed+(char)(i+'a'),fre,length-1);
                fre[i]++;
            }
        }
    }
    public static void frequency(int[] fre,String str){
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            fre[ch-'a']++;
        }
    }
}
