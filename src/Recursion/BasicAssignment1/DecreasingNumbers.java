package Recursion.BasicAssignment1;

public class DecreasingNumbers {
    public static void main(String[] args) {
        decreasing(5);
    }
    public static void decreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        decreasing(n-1);
        //System.out.println("Bye"); For understanding the reverse flow of recursion stack
        System.out.println(n); //Making use of the reverse flow we have printed the increasing order again
    }
}
