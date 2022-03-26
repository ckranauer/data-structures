package _LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    public static void main(String[] args) {

        _LinkedList<String> list = new _LinkedList<String>();

        list.addLast("first");
        list.addLast("second");
        list.addLast("third");



       //LinkedList<String> mylist = new LinkedList<>();
        //mylist.add("asd");
        //mylist.

        //System.out.println(mylist.get(0));

        //System.out.println("Size of the list: "+list.size());
        //list.add(1,"LOL");
        list.addFirst("Hi");
        list.addLast("Good");
        list.addLast("Bye");
        print(list,0);
        print(list,1);
        print(list,2);
        print(list,3);
        print(list,4);
        print(list,5);
        //System.out.println("Size of the list: "+list.size());
        //System.out.println("Element is removed: "+list.remove("second"));
        //print(list,0);
        //print(list,1);
       ////System.out.println("Size of the list: "+list.size());



    }

    static void print(_LinkedList<String> list, int index){
        System.out.println("Value of the "+ index +". element: "+ list.get(index));
    }
}
