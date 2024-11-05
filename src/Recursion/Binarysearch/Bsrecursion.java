package Recursion.Binarysearch;

public class Bsrecursion {
    public static void main(String[] args) {
        int[] arr = {23,43,54,63,72,81,94};
        int target = 94;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr, int target,int start,int end){
        if(end < start){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return  mid;
        }
        if(arr[mid] < target){
            return  search(arr,target,mid+1,end);
        }
            return  search(arr,target,start,mid-1);
    }
}
