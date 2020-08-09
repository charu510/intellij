package Recursion;

public class DiceProblem {
    public static void main(String[] args) {
        dicecount("",4);
    }
    public static void dicecount(String processed,int target){
        if(target==0){
            System.out.println(processed);
            return;
        }
        for (int i = 1; i <=6 && i<=target ; i++) {
            dicecount(processed+i,target-i);
        }

    }
    public static int dicecounting(int target){
        if(target==0){
            return 1;
        }
        int count=0;

        for (int i = 1; i <=6 && i<=target ; i++) {
           count+=dicecounting(target-i);
        }
        return count;
    }

}
