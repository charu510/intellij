package Methods;
//Proof that JAVA works on pass by value concept
public class Swap {
    public static void main(String[] args) {
        int a=4;
        int b=5;
        System.out.println(a+" "+b);
        swap(a,b);
        System.out.println(a+" "+b);
    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);//So we need to print the output inside the method itself
    }
}
