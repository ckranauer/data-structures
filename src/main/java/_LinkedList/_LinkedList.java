package _LinkedList;

    /*
            ADVANTAGES:
                - Insertion and deletion operations are easily implemented
                - Elements are efficiently added or deleted from the middle of the list

            DISADVANTAGES:
                - Elements in a linked list must be read sequentially
                - Elements are not stored sequentially in memory
                - Random access to elements can be inefficient
                - Slower iterations and extra memory overhead are required // need to store the pointer to the next element


     */



public class _LinkedList<E extends Object> {

    private class Node<E extends Object> {

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



    private Node<E> head;
    private int size;

    public _LinkedList(){
        size=0;
    }

    // ADD to the tail // addLast
    public boolean addLast(E value){
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
    public void addFirst(E value){
        if(head == null){
            head = new Node<E>(value);
            size++;
        }else{
            Node temp = new Node<E>(head.getValue());
            temp.setNext(head.getNext());
            head = new Node<E>(value);
            head.setNext(temp);
            size++;
        }
    }



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

    // REMOVE from index
    public E remove(int index){
        if(index>size){
            throw new IndexOutOfBoundsException("Index out of bounds ex");
        }
        if(index == 0){
            if(head.hasNext()){
                Node temp = head.getNext();
                E value = head.getValue();
                head = temp;
                size--;
                return value;
            }
            E value = head.getValue();
            head.setValue(null);
            size--;
            return value;
        }
        int i = 0;
        Node next = head;
        while(i!=index){
            next = next.getNext();
            i++;
        }
        E value = (E) next.getValue();
        Node temp = next.getNext();
        i = 0;
        next = head;
        while(i!=index-1){
            next = next.getNext();
            i++;
        }
        next.setNext(temp);
        size--;
        return value;
    }

    // REMOVE Object o  return boolean
    public boolean remove(E value){
        if(size==0){
            return false;
        }
        if(head.getValue().equals(value)){
            Node temp = null;
            if(head.hasNext()){
                temp = head.getNext();
                head = temp;
            }
            head.setNext(temp);
            size--;
            return true;
        }

        Node next = head;
        for(int i=0; i<size;i++){
            if(value.equals(next.getValue())){
                // save the next node pointer
                Node temp = null;
                if(next.hasNext()){
                    temp = next.getNext();
                }
                // find the previous element (i-1)
                int y = 0;
                Node temp2 = head;
                while(y != i-1){
                    temp2 = temp2.getNext();
                    y++;
                }

                // set it's next the saved next
                temp2.setNext(temp);
                // decrease the collection's size
                size--;
                // return true
                return true;
            }
            next = next.getNext();
        }
        return false;
    }

    // REMOVE from the head


    // SIZE
    public int size(){
        return size;
    }
}
