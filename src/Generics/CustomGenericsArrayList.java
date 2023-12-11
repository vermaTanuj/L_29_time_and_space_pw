package Generics;

import java.util.Arrays;
import java.util.Objects;

public class CustomGenericsArrayList<T> {
    private Objects[] data;
    private static int DEFAULT_SIZE =10;
    private int size=0;

    public CustomGenericsArrayList(){
        this.data=new Objects[DEFAULT_SIZE];
    }
//Add:-
    public void add(T num){
        if(isFull()){
            resize();
        }
  data[size++]= (Objects) num;

    }

    private void resize() {
        Objects[] temp=new Objects[data.length*2];

        //Copy the current array itom into new array;
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        //copying the temp into old one ;
        data=temp;
    }


    private boolean isFull() {
        return size == data.length;
    }

    public  T remove(){
        T remove=(T)data[size--];
        return remove;
    }

    public  T get(int index){
        return (T)data[index];
    }

    public int getindex(int value){
        int rr=-1;
        for(int i=0;i<data.length;i++){
            if(data[i].equals(value)){
                rr=i;
            }
        }
        return rr;
    }

    public int size(){
        return size;
    }

    public void set(int index,T value){
        data[index]= (Objects) value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    //Main:-

    public static void main(String[] args) {
       // ArrayList list =new ArrayList<>();
        CustomGenericsArrayList ct=new CustomGenericsArrayList();
       ct.add(4);
        ct.add(7);
        ct.add(2);
        ct.add(7);
        ct.add(9);
        ct.add(0);
        ct.add(4);
        ct.add(7);
        ct.add(2);
        ct.add(7);
        ct.add(9);
        ct.add(0);


        for(int i=0;i<=9;i++){
            ct.add(i);
        }
        System.out.println(ct);

    }
}
