package Doubts;

import java.util.Scanner;

public class IncredibleHulk {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int result = 0;
        while(t-->0){
            int n = s.nextInt();
            result = 1+hulk(n);
            System.out.println(result);
        }


    }
    public static int hulk(int n){
        double k=0;
        int remaining = 0;
        for (int i = 1; i <=n ; i++) {
            k=Math.pow(2,i);
            if(k<n)
                remaining=(int)(n-k);
        }
        return remaining;
    }
}
