package _ArrayList;

public class _ArrayList {

    // ArrayList implemented from array

    private int[] arr;
    private int size;
    private int counter;

    public _ArrayList(){
        this.size = 10;
        this.arr = new int[size];
        this.counter = 0;
    }
    public _ArrayList(int size){
        this.size = size;
        this.counter = 0;
    }

    // ADD to the end of the list
    public void add(int value){
        if(counter < size){
            arr[counter]= value;
            counter++;
        }else{
            arr = increaseArray(arr);
            arr[counter]=value;
            counter++;
        }
    }

    // ADD to the index position
    public void add(int index, int value){
        if(counter < size){
            if(index == counter){
                arr[index]= value;
                counter++;
            }else if(index > counter){
                throw new IndexOutOfBoundsException("Index out of bound ex");
            }else if(index < counter){
                // rotate
                arr = rotateToRight(index, arr);
                arr[index]= value;
                counter++;
            }
        }else{
            arr = increaseArray(arr);
            add(index, value);
        }
    }


    public int size(){
        return counter;
    }


    public int get(int index){
        return arr[index];
    }

    // REMOVE
    public int remove(int index){
        if(index<counter){
            int temp = arr[index];
            if(index == counter){
                counter--;
                return temp;
            }else{
                arr = rotateToLeft(index,arr);
                counter--;
                return temp;
            }
        }else{
            throw new IndexOutOfBoundsException("Index out of bount ex");
        }
    }

    // CONTAINS
    public boolean contains(int value){
        for(int i=0; i<counter;i++){
            if(arr[i]== value){
                return true;
            }
        }
        return false;
    }

    //**********************************************
    private int[] increaseArray(int[] arr){
        this.size = size*2;
        int[] temp = new int[size];
        for(int i=0; i<arr.length;i++){
            temp[i]=arr[i];
        }
        return temp;
    }

    private int[] rotateToRight(int index, int[] arr){
        int[] temp = new int[size];
        for(int i=0; i< index;i++){
            temp[i]=arr[i];
        }
        for(int i = index; i<counter;i++){
            temp[i+1]=arr[i];
        }
        return temp;
    }

    private int[] rotateToLeft(int index, int[] arr){
        int[] temp = new int[size];
        for(int i=0; i< index;i++){
            temp[i]=arr[i];
        }
        for(int i = index; i<counter;i++){
            temp[i]=arr[i+1];
        }
        return temp;
    }





}
