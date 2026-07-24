package July24;

public class ques2 {
    public static int bs(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        System.out.println(bs(arr, target));
    }
}
