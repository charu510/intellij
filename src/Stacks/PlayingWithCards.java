package Stacks;

import java.util.*;

public class PlayingWithCards {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q = s.nextInt();
        ArrayList<Stack<Integer>>  A = new ArrayList<>();
        ArrayList<Stack<Integer>>  B = new ArrayList<>();
        for (int i = 0; i <=q ; i++) {
            A.add(new Stack<Integer>());
            B.add(new Stack<Integer>());
        }
        for (int i = 0; i <n; i++) {
            A.get(0).push(s.nextInt()); //Putting the initial input in
                                        //the A0th stack
        }
        for (int i = 1; i <=q ; i++) {
            Stack<Integer> ps = A.get(i-1);
            int ithprime = NthPrime(i);
            while(!ps.isEmpty()){
                int item = ps.pop();
                if(item%ithprime==0){
                    B.get(i).push(item);
                }
                else{
                    A.get(i).push(item);
                }
            }
        }
    }
    public static int NthPrime(int n){
        int count=0;
        int i = 2;
        while(true){
            if(isPrime(i))
               count++;
            if(count==n)
                return i;
            i++;
        }
    }
    public static boolean isPrime(int n){
        int div=2;
        while(div*div<=n){
            if(n%div==0)
                return true;
        }
        div++;
        return false;
    }

}
