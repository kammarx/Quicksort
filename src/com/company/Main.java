package com.company;

import java.util.Arrays;

public class Main {
    public static int partition(int[] data, int l, int r ){
        int pivot = data[l];
        int i = l;
        for(int j = l+1;j<=r;j++){
            if(data[j]>pivot){
                i++;
                int temp = data[j];
                data[j]= data[i];
                data[i]= temp;
            }
        }

        int temp = data[i];
        data[i] = data[l];
        data[l] = temp;

        return i;

    }

    public static void qsort(int[] data,int l, int r){
        if(l>=r)return;
        int p = partition(data,l,r);
        qsort(data,l,p-1);
        qsort(data,p+1,r);

    }

    public static void qsort(int[] data){
        qsort(data,0,data.length-1);
    }
    public static void main(String[] args) {
        int [] arr = {4,3,7,2,9,8,1,5,6};
        qsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
