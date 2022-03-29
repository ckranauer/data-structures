package _Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    Node root;

    public BinaryTree(){}

    private Node addRecursive(Node current, int value){
        if(current == null){
            return new Node(value);
        }
        if(value < current.value){
            current.left = addRecursive(current.left, value);
        }else if(value > current.value){
            current.right = addRecursive(current.right, value);
        }else{
            // value already exists
            return current;
        }
        return current;
    }

    public void add(int value){
        root = addRecursive(root, value);
    }

    // Depth-first search
    // goes deep as much as possible
    public void traverseInOrder(Node node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.println(" "+ node.value);
            traverseInOrder(node.right);
        }
    }


    public void traversePreOrder(Node node){
        if(node !=null){
            System.out.println(" "+ node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Node node){
        if(node !=null){
            traversePreOrder(node.left);
            traversePreOrder(node.right);
            System.out.println(" "+ node.value);
        }
    }

    // Breadth-First Search
    // visits all the nodes of the level before going to the next level
    public void traverseLevelOrder(){
        if(root == null){
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while(!nodes.isEmpty()){
            Node node = nodes.remove();

            System.out.println(" "+ node.value);
            //if()
        }
    }
}
