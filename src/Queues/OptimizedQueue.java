package Queues;

public class OptimizedQueue {
    private int[] ar;
    private int DEFAULT_SIZE=10;
    private int rear = 0;
    private int front = 0;
    int size=0;

    public OptimizedQueue() {
        this.ar = new int[DEFAULT_SIZE];
    }

    public boolean isFull(){
        return size==ar.length;
    }
    public void insert(int element){
        if (isFull()){
            return;
        }
        ar[rear++]=element;
        size++;
    }

    public boolean isEmpty(){
        return size==0;
    }
    //Deletion time linear---Implementation 2
    public int delete1(){
        int temp1 = ar[0];
        for (int i = 1; i <rear ; i++) {
            ar[i-1]=ar[i];
        }
        rear--;
        return temp1;
    }
    //Deletion cost constant
    public int delete(){
        if(isEmpty()){
            return -1;
        }
        int temp = ar[front];

        front++;
        size--;
        return temp;
    }

}
