package Stacks;

import java.util.Arrays;

public class Stacks {
    private int[] ar;
    private int top;
    public int size=0; //taken for display func
    private int DEFAULT_SIZE = 10;//initial size of the array

    //default constructor
    public Stacks(){
        this.ar = new int[DEFAULT_SIZE];
        this.top = 0;
    }
    public boolean isFull(){
        return top==ar.length;//considering top=0
    }
    public void push(int element){
        if(isFull()){
            return;
        }
        ar[top++]=element;
        size++;
    }
    public boolean isEmpty(){
        return top==0;
    }
    public int pop(){
        if(isEmpty())
            return -1;
        size--;
        return ar[--top];//first decrement the top pointer then add the new element using push


    }
    //Due to increment and decrement performed
    //to top in the push and pop funcs it is necessary
    //to get a non-assigned fixed value for displaying
    //the peak element of stack
    public int peek(){
        int temp = top-1;
        return ar[temp];
    }
    public void display(){
        for (int i = 0; i <size ; i++) {
            System.out.println(ar[i]);
        }
    }

}
