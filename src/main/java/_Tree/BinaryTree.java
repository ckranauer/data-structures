package _Tree;

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
}
