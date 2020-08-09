package Arrays;
//1, 2, 3, 1, 2, 4, 1
// 2, 1, 3, 1, 5, 2, 2
//[1, 1, 2, 2, 3]
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListeg{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i <size ; i++) {
            list1.add(i);
        }
        System.out.println(list1);


    }

}



