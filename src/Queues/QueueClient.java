package Queues;

public class QueueClient {
    public static void main(String[] args) {

        CircularQueue circularQueue = new CircularQueue();

        for (int i = 0; i <=10 ; i++) {
           circularQueue.insert(i);

        }



        System.out.println();




        for (int i = 0; i <9 ; i++) {
            circularQueue.delete();
            circularQueue.display();

        }

        System.out.println("The winner of the game is:");
        circularQueue.display();
    }
}
