package July24;
import java.util.*;
public class ques1 {
    public static int maxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println(maxElement(arr));
    }
}
