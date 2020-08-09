package Stacks;

public class StackClient {
    public static void main(String[] args) {
        Stacks stack = new Stacks();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        try{
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        stack.display();
        System.out.println("hello");
    }
}
