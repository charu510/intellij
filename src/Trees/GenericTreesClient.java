package Trees;

import java.util.Scanner;

public class GenericTreesClient {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GenericTrees trees = new GenericTrees();

        trees.insert(s);
        trees.display();

        System.out.println(trees.max());
        trees.atLevel(2);


    }
}

