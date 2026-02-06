package com.gla.arrays;

public class GreatestElement {
    public static void main(String[] args){
        int []arr={1,3,7,5,8};
        int max=0;
        for(int i=0; i<arr.length;i++){
            if(arr[1]>max){
                max=arr[1];
            }
        }
        System.out.println("max element is:" + max);
    }
}
