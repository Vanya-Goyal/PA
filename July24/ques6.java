package July24;

public class ques6 {
    
    public int first(int[] nums, int target){
        int low = 0;
        int high = nums.length -1;
        int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                ans = mid;
                high = mid - 1;
            }
            else if( nums[mid] < target){
                low = mid +1;
            }
            else {
                high = mid -1;
            }
        }
        return ans;
    }
    public int last(int[] nums, int target){
        int low = 0;
        int high = nums.length -1;
        int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                ans = mid;
                low = mid + 1;
            }
            else if( nums[mid] < target){
                low = mid +1;
            }
            else {
                high = mid -1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int firstIndex = first(nums, target);

        // if(firstIndex == -1){
        // return new int[]{-1, -1};
        // }

        int lastIndex = last(nums, target);

        return new int[]{firstIndex, lastIndex};
    }

}
