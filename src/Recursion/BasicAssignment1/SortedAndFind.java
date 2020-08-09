package Recursion.BasicAssignment1;

public class SortedAndFind {
    public static void main(String[] args) {
        int[] ar = {4,1,2,3,5};
        int element=3;
        System.out.println(findelement(ar,0,element));
        System.out.println(sum(3));
    }
    public static int findelement(int[] ar,int index,int element){
        if(index==ar.length){
            return -1;
        }
        if(ar[index]==element)
            return index;
        return findelement(ar,index+1,element);
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
