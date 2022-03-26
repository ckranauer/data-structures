package _LinkedList;

public class _LinkedList<E extends Object> {

    private Node<E> head;
    private int size;

    public _LinkedList(){
        size=0;
    }

    // ADD to the tail
    public boolean add(E value){
        if(head != null){
            if(head.hasNext()){
                Node next = head.getNext();
                while(next.hasNext()){
                    next = next.getNext();
                }
                next.setNext(new Node(value));
                size++;
                return true;
            }else{
                head.setNext(new Node(value));
                size++;
                return true;
            }
        }else{
            head = new Node<E>(value);
            size++;
            return true;
        }
    }


    // ADD to the head

    // ADD to the index position add(int index, E value)
    public void add(int index, E value){
        if(index>size){
            throw new IndexOutOfBoundsException("Index out of bounds ex");
        }
        int i = 0;
        Node next = head;
        while(i!=index){
            next = next.getNext();
            i++;
        }

        Node<E> temp = new Node<E>();
        temp.setValue((E) next.getValue());
        if(next.hasNext()){
            temp.setNext(next.getNext());
        }
        next.setValue(value);
        next.setNext(temp);
        size++;
    }

    // GET by index
    public E get(int index){
        if(index>=size){
            throw new IndexOutOfBoundsException("Index out of bounds ex");
        }
        int i = 0;
        Node next = head;
        while(i!=index){
            next = next.getNext();
            i++;
        }
        return (E) next.getValue();
    }

    // REMOVE from the tail

    // REMOVE from the head

    // SIZE
    public int size(){
        return size;
    }
}
