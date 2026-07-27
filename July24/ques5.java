package July24;

public class ques5 {
    int search(int[] arr, int key) {
        
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == key) return mid;
            // check if left is sorted
            if(arr[low] <= arr[mid]){
                //check if it lies inside left part
                if(arr[low] <= key && key <= arr[mid]){
                    high = mid -1;
                }
                else{
                    low = mid +1;
                }
            }
            // else right is sorted
            else{
                if(arr[mid] <= key && key <= arr[high]){
                    low = mid + 1;
                }
                else{
                    high = mid -1;
                }
            }
        }
        return -1;
    }
}
