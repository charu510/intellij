package Assingment4;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar1 = new int[n];
        for (int i = 0; i < ar1.length ; i++) {
            ar1[i]=s.nextInt();
        }
        int[] ar2 = new int[n];
        for (int i = 0; i < ar2.length ; i++) {
            ar2[i]=s.nextInt();
        }
        frequency(ar1,ar2);

    }
    public static void frequency(int[] ar1,int[] ar2) {
        int[] fr = new int[ar1.length];
        int visited = -1;
        for (int i = 0; i < ar1.length; i++) {
            int count = 1;
            for (int j = i + 1; j < ar1.length; j++) {
                if (ar1[i] == ar1[j]) {
                    count++;
                    fr[j] = visited;
                }
            }

        }
        for (int i = 0; i < ar2.length; i++) {
            int countfinal = 1;
            if (fr[i] == ar2[i])
                countfinal--;

            if (fr[i] != visited) {
                fr[i] = countfinal;
            }
            Arrays.sort(fr);
            System.out.println(fr[i]);
        }
    }

    }

