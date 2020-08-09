package Doubts;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n=3;
        TOH(n,"A","B","C");
    }
    public static void TOH(int n,String A,String B,String C){
        //base condition
        if(n==0)
            return;
        TOH(n-1,A,C,B);
        System.out.println("Move the"+n+"th disk source"+A+"to disc"+C);

        TOH(n-1,C,B,A);
    }

}
