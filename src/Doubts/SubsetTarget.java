package Doubts;

public class SubsetTarget {
    public static void main(String[] args) {
        int n = 3;
        int target = 3;
        int[] ar = {1,2,3};
        SubSet(ar,0,target,0,"");
    }
    public static void SubSet(int[] ar,int idx,int Target,int sum,String ans){
        if(sum==Target){
            System.out.println(ans);
            return;
        }
        if(idx==ar.length){
            return;
        }
        SubSet(ar,idx+1,Target,sum+ar[idx],ans+ar[idx]+" ");
        SubSet(ar,idx+1,Target,sum,ans);
    }
}
