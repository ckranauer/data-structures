import _ArrayList._ArrayList;

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

        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }


    }
}
