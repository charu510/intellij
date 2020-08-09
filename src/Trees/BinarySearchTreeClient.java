package Trees;

public class BinarySearchTreeClient {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        int[] sorted = {7,4,2,5,15,10,25};
        int[] in = {2,4,5,7,10,15,25};

        bst.makefromprein(sorted,in);
        bst.display();
        //bst.makefromsorted(sorted,0,sorted.length-1);

//        bst.insert(1);
//        bst.insert(3);
//        bst.insert(5);
//        bst.insert(2);

        //bst.sort();
        //System.out.println(bst.successor(5));

        bst.inrange(1,5);

    }
}
