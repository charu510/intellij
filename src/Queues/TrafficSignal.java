package Queues;

import java.util.Scanner;

public class TrafficSignal {
    public static void main(String[] args) {
        System.out.println("The functional signals will be indicated by 50");
        System.out.println("Want the even numbered rows to be functional?");
        Scanner s = new Scanner(System.in);
        boolean control = s.nextBoolean();
        CircularQueue cq1 = new CircularQueue();
        for (int i = 0; i <8 ; i++) {
            cq1.insert(i);
        }
        if(control)
            cq1.evenDisplay();
        else
            cq1.oddDisplay();

    }

}

