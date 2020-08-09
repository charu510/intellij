package Queues;

public class QueueTask {
    private int[] ar;
    private int DEFAULT_SIZE=10;
    private int front = 0;
    private int rear = 0;
    int size=0;

    public QueueTask() {
        this.ar = new int[DEFAULT_SIZE];
    }
    public boolean isFull(){
        return (size==ar.length);
    }
    public void insert(int element){
        if(isFull())
            return;
        ar[rear++]=element;
        size++;
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public int delete(){
        if(isEmpty())
            return -1;
        int temp = ar[front];
        front++;
        size--;
        return temp;
    }
    public void display(){
        for (int i = 0; i <size ; i++) {
            System.out.print(ar[(front+i)%ar.length]+" ");
        }
        System.out.println();
    }

    public int maximum(){
        int max = ar[front];
        for (int i = front; i <size ; i++) {
            if(ar[i]>max)
                max=ar[i];
        }
        front++;
        return max;
    }
    public int sumEven(){

        int sum = 0;
        for (int i = front; i <size ; i++) {
            if(ar[i]%2==0)
                sum+=ar[i];
        }
        front++;
        return sum;
    }
    public void updateQueue(){
        for (int i = 0; i <size ; i++) {
            if(ar[i]%2!=0)
                ar[i] = -1;
            else
                ar[i] = ar[i];
        }
        for (int i = 0; i <size ; i++) {
            System.out.print(ar[i]+" ");
        }
    }
}

