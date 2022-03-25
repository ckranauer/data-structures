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

    public int size(){
        return counter;
    }

    private int[] increaseArray(int[] arr){
        int[] temp = new int[size*2];
        for(int i=0; i<arr.length;i++){
            temp[i]=arr[i];
        }
        return temp;
    }

    public int get(int index){
        return arr[index];
    }




}
