package Methods.Assignment3;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n1");
        int n1 = s.nextInt();
        System.out.println("Enter n2");
        int n2 = s.nextInt();
        seriesOutput(n1,n2);

    }
    public static void seriesOutput(int n1,int n2){
        int count=0;
        int i=1;
        while(count<n1){
            int result=3*i+2;
            i++;
            if(result%n2!=0){
                System.out.println(result);
                count++;
            }
        }
    }

}
