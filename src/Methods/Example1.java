package Methods;

public class Example1 {
    public static void main(String[] args) {
        fun();
        System.out.println(sum(4,5));
    }
    public static void fun(){
        System.out.println("Hello");
    }

    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }


}
