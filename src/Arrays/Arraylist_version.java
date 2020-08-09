//package Arrays;
//
//public class Arraylist_version {
//    private int[] data;
//    private int DEFAULT_SIZE=10;
//    private int size;
//    public Arraylist_version() {
//        this.data = new int[DEFAULT_SIZE];
//        size=0;
//    }
//    public boolean isfull(){
//        return size==data.length;
//    }
//    public void add(int element){
//        if(isfull()){
//            resize();
//        }
//        data[size++]=element;
//    }
//    public void resize(){
//        System.out.println("changed");
//        int[] ar = new int[2*ar.length];
//        for (int i = 0; i <ar.length ; i++) {
//            data[i] = ar[i];
//        }
//        data=ar;
//    }
//    public int size(){
//        return size;
//    }
//    public int get(int index){
//        return data[index];
////    }
//    public void set(int index,int element){
//        data[index]=element;
//    }
//    public static int remove(){
//        int temp=data[size-1]; //so that the empty
//         size--;                       //elements are not returned
//        return temp;
//    }
//}
