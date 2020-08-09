package Doubts;

import java.util.Arrays;

public class Ladder {
    public static void main(String[] args) {

    }
    public static boolean[] SOE(int n){
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for (int i = 2; i*i <prime.length ; i++) {
            if(prime[i]){
                for (int j = 2; j*i <=n ; j++) {
                    prime[i*j]=false;
                }
            }
        }
        return prime;
    }
    
}
