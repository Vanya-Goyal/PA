package ques1;
import java.util.*;

public class ques1{

    private ArrayList funct(int[] arr){
        int sum = 0;
        int maxSum = 0;
        for(int i=0; i<3; i++){
            sum+= arr[i];
            maxSum = sum ;
            for(int j=3; j<arr.length; j++){
                sum += arr[j];
                sum -= arr[j-3];
                maxSum = Math.max(maxSum, sum);
            }
        }
        
    }
    public static void main(String[] args){

    }
}

