package Doubts;

import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        roots(a,b,c);
    }
    public static void roots(int a ,int b,int c){
        double dis = (int)(b*b)-4*a*c;
        int root1 =(int)(-b+Math.sqrt(dis))/2*a;
        int root2 =(int)(-b-Math.sqrt(dis))/2*a;
        if(dis>0) {
            System.out.println("Real and Distinct");
            if(root1>root2)
                System.out.print(root2+" "+root1);
            else
                System.out.print(root1+" "+root2);
        }
        else if(dis==0) {
            System.out.println("Real and Equal");
            System.out.print(root1+" "+root2);
        }
        else {
            System.out.println("Imaginary");
        }
    }
}
