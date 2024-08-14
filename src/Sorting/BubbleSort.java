package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,4,1,7,8,3,2};

        for (int i = 0; i < arr.length-1; i++) {
            //length-i-1 for ignoring the comparison that are not necessary
            for (int j = 0; j < arr.length-i-1; j++) {
                //swapping variables
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
