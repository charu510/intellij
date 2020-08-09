package Stacks;

public class PopEven {
    public int[] ar;
    public int top;
    public int size=0;
    public int DEFAULT = 10;

    //building the constructor
    public PopEven(){
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
    public void popeve(Stacks input,int n){
        int i,t=0;
       //int temp[n];
        int temptop=0;
        if(top==0){
            System.out.println("Stack empty");
            return;
        }
        for (int j = 0; j <top ; j++) {
            if((j+1)%2!=0){
                //temp[t]=ar[i];
                t++;
            }
        }
        temptop=top;
        for (int j = 0; j <temptop ; j++) {
            input.pop();
        }
        for (int j = 0; j <t ; j++) {
            top++;
           // ar[i]=temp[i];
        }
        --top;
        for (int j = 0; j <top ; j++) {
            //System.out.println(ar[i]);
        }
        return;
    }
}
