package Networks_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class CheckSum {
    public static void main(String[] args) {
        System.out.println("Enter the sum previously obtained");
        Scanner s = new Scanner(System.in);
        String bin = s.nextLine();
        complement(bin);
    }
    public static char flip(char c){
        return (c=='0')?'1':'0';
    }
    public static void complement(String bin){
        int n = bin.length();
        String ones = "";

        //for one's complement flip every bit
        for (int i = 0; i <n ; i++) {
            ones+=flip(bin.charAt(i));
        }
        System.out.println("The checksum is: "+ones);
    }
}
