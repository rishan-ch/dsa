package Sorting;

import java.util.Arrays;

public class ArraySelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,1,3,2,5,9,6,0,8,7};

        //outer loop
        for(int i=0; i<arr.length-1;i++){
            int minIndex=i;
            //checks out the smallest value
            //returns index
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            //swapping
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
