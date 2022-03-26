package _LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    public static void main(String[] args) {

        _LinkedList<String> list = new _LinkedList<String>();

        list.add("first");
        list.add("second");
        list.add("third");

        List<String> mylist = new LinkedList<>();
        mylist.add("asd");

        System.out.println(mylist.get(0));

        System.out.println("Size of the list: "+list.getSize());
        print(list,0);
        print(list,1);
        print(list,2);

        list.add(1,"LOL");
        print(list,0);
        print(list,1);
        print(list,2);
        print(list,3);

    }

    static void print(_LinkedList<String> list, int index){
        System.out.println("Value of the "+ index +". element: "+ list.get(index));
    }
}
