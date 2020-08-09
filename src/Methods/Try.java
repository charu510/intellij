package Methods;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int nst=n/2;
        int nsp=-1;
        while(row<=n){
            int col=1;
            while(col<=nst){
                System.out.print("*"+" ");
                col=col+1;
            }
            //space
            col=1;
            while(col<=nsp){
                System.out.print("  ");
                col=col+1;
            }
            col=1;
            while(col<=nst){
                System.out.print("*"+" ");
                col=col+1;
            }
            System.out.println();
            row=row+1;
        }
    }

}
