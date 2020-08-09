package Doubts;

import java.util.Scanner;

public class PiyushInMagicalPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //rows
        int m = sc.nextInt(); //cols
        int k = sc.nextInt(); //treshold strength
        int s = sc.nextInt(); //piyush strength
        char[][] ar = new char[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                ar[i][j]=sc.next().charAt(0);
            }
        }
        if(park(ar,n,m,k,s)>k){
            System.out.println("Yes");
            System.out.println(park(ar,n,m,k,s));
        }
        else{
            System.out.println("No");
        }
    }
    public static int park(char[][] ar,int n,int m,int k,int s){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if(s<k)
                    break;
                if(ar[i][j]=='.')
                    s=s-2;
                else if(ar[i][j]=='*')
                    s=s+5;
                else
                    break;
                if(j!=n-1)
                    s=s-1;
            }
        }
        return s;
    }
}

