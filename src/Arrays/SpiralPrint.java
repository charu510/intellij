package Arrays;                                                         /*11 12 13 14
                                                                          21 22 23 24
                                                                          31 32 33 34
                                                                          41 42 43 44*/
import java.util.Scanner;

public class SpiralPrint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt(); //Rows
        int n = s.nextInt(); //Columns
        int[][] ar = new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                ar[i][j]=s.nextInt();
            }
        }
        Spiral(ar,m,n);
    }
    public static void Spiral(int[][] ar,int m,int n){
        int top=0;
        int bottom=m-1;
        int left=0;
        int right=n-1;
        int count=1;
        while(count<=m*n) {
            if(count<=m*n) {
                for (int i = left; i <= right; i++) {
                    System.out.println(ar[top][i]);
                    count++;
                }
                top++;
                for (int i = top; i <= bottom; i++) {
                    System.out.println(ar[i][right]);
                    count++;
                }
                right--;
                for (int i = right; i >= left; i--) {
                    System.out.println(ar[bottom][i]);
                    count++;
                }
                bottom--;
                for (int i = bottom; i >= top; i--) {
                    System.out.println(ar[i][left]);
                    count++;
                }
                left++;
            }
        }
        System.out.println("END");
    }
}
