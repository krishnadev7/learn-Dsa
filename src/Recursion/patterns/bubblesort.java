package Recursion.patterns;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4};
    sort(arr,arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int r, int c){
        if( r== 0){
            return;
        }
        if( c < r){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            sort(arr,r,c+1);
        }else{
            sort(arr,r-1,0);
        }
    }
}
