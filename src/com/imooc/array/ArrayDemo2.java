package com.imooc.array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //求数组元素的最大值

        int[] a ={34,23,78,56,31};
        int max=a[0];

        for (int i = 1; i<a.length; i++){
            if (a[i]>max){
                max = a[i];
            }
        }
        System.out.println("最大值："+max);
    }
}
