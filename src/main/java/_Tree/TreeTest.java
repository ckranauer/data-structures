package _Tree;

public class TreeTest {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.add(4);
        tree.add(8);
        tree.add(1);
        tree.add(3);
        tree.add(11);

        System.out.println("In-order:");
        tree.traverseInOrder(tree.root);

        System.out.println("Pre-order:");
        tree.traversePreOrder(tree.root);
    }
}
