package Doubts;



import java.util.*;

import java.util.Arrays;

public class SumItup {
    static Set<String> set = new HashSet<>();
    public static void main(String[] args) {

        int[] ar1 = {10,7,1,6,5,2,1};
        Arrays.sort(ar1);
        SumItUp(ar1,0,8,0,"");
    }
    public static void SumItUp(int[] ar,int idx,int Target,int sum,String ans){
        if(sum==Target){
            if(!set.contains(ans)){
                set.add(ans);
                System.out.println(ans);
            }
            return;
        }
        if(idx==ar.length){
            return;
        }
        SumItUp(ar,idx+1,Target,sum+ar[idx],ans+ar[idx]+" ");
        SumItUp(ar,idx+1,Target,sum,ans);
    }
}
