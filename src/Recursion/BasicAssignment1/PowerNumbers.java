package Recursion.BasicAssignment1;

public class PowerNumbers {
    public static void main(String[] args) {
        int base=2;
        int expo=3;
        System.out.println((power(base,expo)));
    }
    public static int power(int base,int expo){
        if(expo==0){
            return 1;
        }
        expo=expo-1;
        return base*power(base,expo);

    }
}
