package Stacks;



public class SortingStacks {
    public int[] ar;
    public int top;
    public int size=0;
    private int DEFAULT_SIZE=10;

    //default constructor
    public SortingStacks(){
        this.ar = new int[DEFAULT_SIZE];
        this.top=0;
    }
    public boolean isFull(){
        return top==ar.length;
    }
    public void push(int element){
        if(isFull())
            return;
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
        return ar[--top];
    }
    public int peek(){
        return ar[top-1];
    }
    public void display(){
        for (int i = 0; i <size ; i++) {
            System.out.print(ar[i]+" ");
        }
    }
public static void sortstack(Stacks input){
        //create a temporary stack
    Stacks temp = new Stacks();

    while(!input.isEmpty()){
        //pop out the first element
        int tmp = input.pop();

        //while temporary stack is not empty
        //and top of stack is greater than temp
        while(!temp.isEmpty() && temp.peek()>tmp){
            //pop from temporary stack
            //and push in the empty stack
            input.push(temp.pop());
        }
        //push temp in the temporary stack
        temp.push(tmp);
    }
    temp.display();
}

    public static void main(String[] args) {
        Stacks input = new Stacks();
        input.push(5);
        input.push(10);
        input.push(3);
        input.push(1000);
        input.push(1);

        //This is the temporary stack

        System.out.println("Sorted numbers are");
        sortstack(input);
    }
}
