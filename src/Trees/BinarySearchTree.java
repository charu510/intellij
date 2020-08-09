package Trees;

import java.util.Arrays;

public class BinarySearchTree {

    Node root;

    public void insert(int value){
        this.root = insert(root,value);
    }
    private Node insert(Node node,int value){
        if(node==null){
            return new Node(value);
        }
        if(node.value>value){
            node.left = insert(node.left,value);
        }
        else{
            node.right = insert(node.right,value);
        }
        return node;
    }
    public void makefromprein(int[] pre,int[] in){
        this.root = makefromprein(root,pre,in);
    }
    private Node makefromprein(Node node,int[] pre,int[] in){
        if(in.length==0){
            return null;
        }

        int ele = pre[0];
        int index = find(in,ele);

        int[] pre_left = Arrays.copyOfRange(pre,1,index+1);
        int[] pre_right = Arrays.copyOfRange(pre,index+1,pre.length);

        int[] in_left = Arrays.copyOfRange(in,0,index);
        int[] in_right = Arrays.copyOfRange(in,index+1,in.length);

        Node node1 = new Node(ele);

        node1.left = makefromprein(node1.left,pre_left,in_left);
        node1.right = makefromprein(node1.right,pre_right,in_right);

        return node1;
    }
    public int find(int[] in,int ele){
        for (int i = 0; i <in.length ; i++) {
            if(ele==in[i])
                return i;
        }
        return -1;
    }
    public void display(){
        display(root, "");
    }

    private void display(Node node,String indent) {

        if(node == null){
            return;
        }

        System.out.println(indent+node.value);

        display(node.left, indent+"\t");
        display(node.right, indent + "\t");
    }

    public void sort(){
        sort(root);
    }
    private void sort(Node node){
        if(node == null){
            return;
        }
        sort(node.left);
        System.out.println(node.value);
        sort(node.right);
    }

    //successor
    public int successor(int value){
        Node successor = null;
        Node current = root;

        while(current!=null){
            if(current.value>value){
                successor = current;
                current = current.left;
            }
            else{
                current = current.right;
            }

        }
        if(successor == null){
            return -1;
        }
        else{
            return successor.value;
        }
    }
    public void inrange(int k1,int k2){
        inrange(root,k1,k2);
    }
    private void inrange(Node node,int k1,int k2){
        if(node==null){
            return;
        }
        if(node.value>k1 && node.value<k2){
            System.out.println(node.value);
        }
        if(node.value>k1){
            inrange(node.left,k1,k2);
        }
        if(node.value<k2){
            inrange(node.right,k1,k2);
        }
    }
    public void makefromsorted(int[] ar,int low,int high){
        if(low>high){
            return;
        }
        int mid = (low+high)/2;

        insert(ar[mid]);
        makefromsorted(ar,low,mid-1);
        makefromsorted(ar,mid+1,high);

    }
    class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;

        }
    }
}
