// hotel 

package ques1;
import java.util.*;

public class ques1{

    public pair<Integer, Integer> func(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;

        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return new pair<>(left, right);
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return new pair<>(-1, -1);
    }
    public static void main(String[] args){

    }
}