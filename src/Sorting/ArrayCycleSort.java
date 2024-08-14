package Sorting;

import java.util.Arrays;

public class ArrayCycleSort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,9,4,6,7,5,8};

        for(int i=0; i<arr.length; i++){
            //checks if the element is at correct index
            if(arr[i]-1!=i){
                //swapping
                int element = arr[i];
                int temp = arr[i];
                arr[i] = arr[element-1];
                arr[element-1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
