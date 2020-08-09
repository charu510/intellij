package Queues;

public class CircularQueue {
    private int[] ar;
    private int DEFAULT_SIZE=10;
    private int rear = 0;
    private int front = 0;
    int size=0;

    public CircularQueue() {
        this.ar = new int[DEFAULT_SIZE];
    }

    public boolean isFull(){
        return size==ar.length;
    }
    public void insert(int element){
        if (isFull()){
            return;
        }
//        if(rear==ar.length){
//            rear=0;
//        }
        ar[rear++]=element; //alternate approach
        rear = rear%ar.length;
        size++;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public int delete(){
        if(isEmpty()){
            return -1;
        }
        int temp = ar[front];

        front++;
        front = front%ar.length;
        size--;
        return temp;
    }
    public void display(){
        for (int i = 0; i <size ; i++) {
            System.out.print(ar[(front+i)%ar.length]+" ");
        }
        System.out.println();
    }
    public void evenDisplay(){
        for (int i = 0; i <size ; i++) {
            if(ar[i]%2==0)
                ar[i]=50;
        }
        for (int i = 0; i <size ; i++) {
            System.out.print(ar[i]+" ");
        }
    }
    public void oddDisplay(){
        for (int i = 0; i <size ; i++) {
            if(ar[i]%2!=0)
                ar[i] = 50;
        }
        for (int i = 0; i <size ; i++) {
            System.out.print(ar[i]+" ");
        }
    }

}
