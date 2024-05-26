package LinearSearch;

public class main {
    public static void main(String[] args) {
        int[] arr = {1,43,54,23,53,24,12};
        int target = 1212;
        int ans = linearsearch(arr, target);
        System.out.println(ans);
    }

   static int  linearsearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
