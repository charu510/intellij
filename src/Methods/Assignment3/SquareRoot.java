package Methods.Assignment3;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        System.out.println(root(n));

    }
    public static int root(int n){
        int squareRoot=1;
        for (int i = 1; i <=n ; i++) {
            if(n/i==i)
                squareRoot=i;
        }
        return squareRoot;
    }
}
