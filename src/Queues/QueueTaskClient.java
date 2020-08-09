package Queues;

import java.util.Scanner;

public class QueueTaskClient {
    public static void main(String[] args) {
        QueueTask q = new QueueTask();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <=n ; i++) {
            int element = s.nextInt();
            q.insert(element);
        }
        q.display();
        System.out.println(q.maximum());
        System.out.println(q.sumEven());
        q.updateQueue();

    }
}
