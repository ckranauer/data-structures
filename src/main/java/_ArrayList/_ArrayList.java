package _ArrayList;

/*

        - Provide fast access using indexing
        - Memory coherence  // elements stored sequentially in the memory
        - Provides initial size
        




 */

public class _ArrayList<E extends Object> {

    // ArrayList implemented from array


    private Object[] arr;
    private int size;
    private int counter;

    public _ArrayList(){
        this.size = 10;
        this.arr = new Object[size];
        this.counter = 0;
    }
    public  _ArrayList(int size){
        this.size = size;
        this.counter = 0;
    }

    // ADD to the end of the list
    public void add(E value){
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
    public void add(int index, E value){
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


    public Object get(int index){
        return arr[index];
    }

    // REMOVE by index
    public Object remove(int index){
        if(index<counter){
            Object temp = arr[index];
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

    // REMOVE by object
    public boolean remove(E object){
        for(int i=0; i<counter;i++){
            if(arr[i].equals(object)){
                Object temp = arr[i];
                if(i == counter){
                    counter--;
                    return true;
                }else{
                    arr = rotateToLeft(i,arr);
                    counter--;
                    return true;
                }
            }
        }
        return false;
    }

    // CONTAINS
    public boolean contains(E value){
        for(int i=0; i<counter;i++){
            if(arr[i]== value){
                return true;
            }
        }
        return false;
    }

    //**********************************************
    private Object[] increaseArray(Object[] arr){
        this.size = size*2;
        Object[] temp = new Object[size];
        for(int i=0; i<arr.length;i++){
            temp[i]=arr[i];
        }
        return temp;
    }

    private Object[] rotateToRight(int index, Object[] arr){
        Object[] temp = new Object[size];
        for(int i=0; i< index;i++){
            temp[i]=arr[i];
        }
        for(int i = index; i<counter;i++){
            temp[i+1]=arr[i];
        }
        return temp;
    }

    private Object[] rotateToLeft(int index, Object[] arr){
        Object[] temp = new Object[size];
        for(int i=0; i< index;i++){
            temp[i]=arr[i];
        }
        for(int i = index; i<counter;i++){
            temp[i]=arr[i+1];
        }
        return temp;
    }





}
