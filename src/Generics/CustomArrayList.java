package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE =10;
    private int size=0;

    public CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }
//Add:-
    public void add(int num){
        if(isFull()){
            resize();
        }
  data[size++]=num;

    }

    private void resize() {
        int[] temp=new int[data.length*2];

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

    public  int remove(){
        int remove=data[size--];
        return remove;
    }

    public  int get(int index){
        return data[index];
    }

    public int getindex(int value){
        int rr=-1;
        for(int i=0;i<data.length;i++){
            if(data[i]==value){
                rr=i;
            }
        }
        return rr;
    }

    public int size(){
        return size;
    }

    public void set(int index,int value){
        data[index]=value;
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
        CustomArrayList ct=new CustomArrayList();
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
