package _Queue;

import java.util.Stack;

public class _Queue<E extends Object> {

    // Queue using stacks

    private Stack<E> stack1;
    private Stack<E> stack2;

    public _Queue(){
        stack1 = new Stack<E>();
        stack2 = new Stack<E>();
    }

    // ADD  - enqueue
    public void add(E o){
        stack1.push(o);
    }


    // REMOVE - dequeue
    public E remove(){
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        E temp = stack2.pop();
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return temp;
    }

    public boolean empty(){
        if(stack1.empty()){
            return true;
        }
        return false;
    }




}
