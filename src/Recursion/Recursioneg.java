package Recursion;

public class Recursioneg {
    public static void main(String[] args) {
        //pd5(4);
        System.out.println(fibo(4));
    }
//    public static void pd5(int n){
//        if(n==0){
//            return;
//        }
//        System.out.println(n);
//        pd5(n-1);
//    }
//    public static int factorial(int n){
//        if(n==0)
//            return 1;
//        return n*factorial(n-1);
//    }
    public static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
