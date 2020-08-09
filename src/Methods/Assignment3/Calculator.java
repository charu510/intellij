package Methods.Assignment3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 1st argument");
        int a = s.nextInt();
        System.out.println("Enter the 2st argument");
        int b = s.nextInt();
        System.out.println("Enter the character for operation");
        char op = s.next().charAt(0);
        switch(op){
            case '+':
                System.out.println(add(a,b));
                break;
            case '-':
                System.out.println(subtract(a,b));
                break;
            case '*':
                System.out.println(multiply(a,b));
                break;
            case '/':
                System.out.println(division(a,b));
                break;
            case '%':
                System.out.println(modulus(a,b));
                break;
            case 'x':
               System.exit(1);
               break;
            default:
                System.out.println("Enter the 1st argument");
                int c = s.nextInt();
                System.out.println("Enter the 2st argument");
                int d = s.nextInt();
                System.out.println("Enter the character for new operation");
                char operator = s.next().charAt(0);

        }



    }

    public static int add(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static int subtract(int a,int b){
        int difference = a-b;
        return difference;
    }
    public static int multiply(int a,int b){
        int product = a*b;
        return product;
    }
    public static int division(int a,int b){
        int quotient = a/b;
        return quotient;
    }
    public static int modulus(int a,int b){
        int remainder = a%b;
        return remainder;
    }

}
