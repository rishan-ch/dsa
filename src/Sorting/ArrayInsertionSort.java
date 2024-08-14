package Sorting;

import java.util.Arrays;

public class ArrayInsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,6,4,};
        int l = arr.length;

        for (int i = 0; i <l-1 ; i++) {
            //compares one element with others until at right position
            for (int j = i+1; j >0 ; j--) {
                //swapping
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
