package _LinkedList;

public class Node<E extends Object> {

    private E value;
    private Node next;

    public Node(){}

    public Node(E value){
        this.value=value;
    }

    public void setNext(Node<E> next){
        this.next = next;
    }

    public boolean hasNext(){
        if(this.next != null ){
            return true;
        }
        return false;
    }

    public Node<E> getNext(){
        return next;
    }

    public void setValue(E value){
        this.value= value;
    }

    public E getValue(){
        return value;
    }

}
