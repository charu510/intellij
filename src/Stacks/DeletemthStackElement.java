package Stacks;

import java.util.Scanner;

public class DeletemthStackElement {
    public int[] ar;
    public int top;
    public int size=0;
    public int DEFAULT = 10;

    //building the constructor
    public DeletemthStackElement(){
        this.ar = new int[DEFAULT];
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
        return top==1;
    }
    public int pop(){
        if(isEmpty())
            return -1;
        size--;
        return ar[--top];//first decrement the top pointer then add the new element using push
    }
    public void display(){
        for (int i = 0; i <size ; i++) {
            System.out.println(ar[i]);
        }
    }
    public static Stacks delete(Stacks input,int n,int curr,int mth){
        //if stack is empty and all items are traversed
        if(input.isEmpty() || curr==n){
            return input;
        }
        //remove current items
        int x = input.pop();

        //remove other items
        delete(input,n,curr-1,mth);

        //Put all the items back excepth mth
        if(curr!=mth)
            input.push(x);
        return input;
    }


    public static void main(String[] args) {
        Stacks input = new Stacks();
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        for (int i = 0; i <size ; i++) {
            int n = s.nextInt();
            input.push(n);
        }
        int m = s.nextInt();
        delete(input,size,size-1,m);

        input.display();


    }


}
