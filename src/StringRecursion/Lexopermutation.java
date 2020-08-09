package StringRecursion;

import java.util.Scanner;

public class Lexopermutation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int[] freq = new int[26];
        frequency(freq,str);
        lexopermutations("",freq,str.length(),str);
        
    }
    public static void frequency(int[] freq,String str){
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }
    }
    public static void lexopermutations(String processed,int[] fre,int length,String str){
        if(length==0){
            if(processed.compareTo(str)>0)
                System.out.println(processed);
            return;
        }
        for (int i = 0; i <fre.length ; i++) {
            if(fre[i]>0){
                fre[i]--;
                lexopermutations(processed+(char)(i+'a'),fre,length-1,str);
                fre[i]++;
            }
        }
    }
}
