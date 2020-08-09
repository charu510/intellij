import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <ar.length ; i++) {
            ar[i]=s.nextInt();
        }
        System.out.println(minimum(ar));
    }
    public static int minimum(int[] ar){
        int min = 0;
        for (int i = 0; i <ar.length ; i++) {
            if(ar[i]<ar[min])
                min=i;
        }
        int even = ar[0];
        for (int i = 0; i <ar.length ; i++) {
            if(ar[min]%2==0)
                even = ar[min];
        }
        return even;
    }



}
