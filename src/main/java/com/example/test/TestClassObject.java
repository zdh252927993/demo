package com.example.test;

public class TestClassObject {
    public static void main(String[] args) {

    }
    void removeDuplicate(String s){
        int length = s.length();
        if(length<2)
            return;
        int newIndex=0;
        int[] check=new int[8];
        for(int i=0;i<length;++i){
            int gap=Integer.valueOf(s.charAt(i));
            int index=gap/8;
            int shift=gap%8;
            if((check[index]&(1<<shift))==0){
                break;
            }
            System.out.println(2);
        }
    }
}