package Dynamic;

public class ArrayList {
    private int[] data;
    private int DEFAULT = 10;
    private int size=0;

    public ArrayList() {
        this.data = new int[DEFAULT];
        size=0;
    }
    public boolean isFull(){
        return size==data.length;
    }
    public void add(int element){
        if (isFull()){
            resize();
        }
        data[size++] = element;
    }
    public void resize(){
        System.out.println("I changed");
         int[] ar = new int[2*data.length];
        for (int i = 0; i <data.length ; i++) {
            ar[i]=data[i];
        }
        data = ar;
    }
    public int size(){
        return size;
    }
    public int get(int index){
        return data[index];
    }
    public void set(int index,int element){
        data[index]=element;
    }
    public int remove(){
        int temp = data[size-1];
        size--;
        return temp;
    }
}
