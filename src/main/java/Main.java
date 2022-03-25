import _ArrayList._ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        _ArrayList list = new _ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);

        System.out.println("Size: "+list.size());

        list.add(12,13);
        list.add(13,14);
        list.add(14,15);
        list.add(15,16);
        list.add(16,17);
        list.add(17,18);
        list.add(18,19);
        list.add(19,20);
        list.add(20,21);
        list.add(21,22);

        System.out.println("Remove this: "+list.remove(10));

        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("Size: "+list.size());

        System.out.println("Is contain: "+ list.contains(10));

        _ArrayList<String> wordList = new _ArrayList<String>();

        wordList.add("word");
        System.out.println("Is contain: "+ wordList.contains("word"));
       // System.out.println("Remove a string: "+wordList.remove(0));
        System.out.println("Delete word: "+wordList.remove("word"));
        System.out.println("Is contain: "+ wordList.contains("word"));

        List<String> mylist = new ArrayList<>();
       // myList.re

        //mylist.add(4)


/*
        List mylist = new ArrayList();
        mylist.add(4);
        mylist.add(4);
        mylist.add(4);
        mylist.add(2);

        mylist.forEach(System.out::println);


        mylist.forEach(System.out::println);

 */








    }
}
