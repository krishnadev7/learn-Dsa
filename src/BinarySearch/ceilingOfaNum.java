package BinarySearch;

public class ceilingOfaNum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 10;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;

        while (s<e){
            int mid = s + (e-s) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(target > arr[mid]){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
    return  s ;
    }
}
