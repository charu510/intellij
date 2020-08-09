package Recursion.BasicAssignment1;

public class PalindromeArray {
    public static void main(String[] args) {
        int[] ar = {1, 2, 1};
        int n = ar.length;
        System.out.println(pal(ar,0,n-1));
    }

    public static boolean pal(int[] ar, int begin, int end) {
        if (begin >= end)
            return true;
        if (ar[begin] == ar[end])
            return pal(ar, begin + 1, end - 1);
        else
            return false;
    }
}
