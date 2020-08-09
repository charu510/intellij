package Doubts;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] price = {120,40,220,500,1};
        int n = 5;
        System.out.println(Arrays.toString(stockSpan(price)));
    }
    public static int[] stockSpan(int[] price){
        int[] span = new int[price.length];
        Stack<Integer> stack = new Stack<>();

        span[0] = 1; // the first element will always have a span of 1;
        stack.push(0); //pushing the indices

        for (int i = 1; i <price.length ; i++) {
            while(!stack.isEmpty() && price[stack.peek()]<price[i]){
                //checking if the current price is less than the first stored one
                stack.pop();
            }
            if(stack.isEmpty()){
                span[i] = i+1;
                //Meaning all the previous elements are less than
                //the current one
            }
            else{
                span[i] = i - stack.peek();
            }
            stack.push(i);
        }
        return span;
    }
}
