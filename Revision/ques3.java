package Revision;
import java.util.*;

public class ques3 {
    public void print(int idx, List<Integer> ls, int[] arr){
        if(idx == arr.length){
            for(int i: ls){
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        ls.add(arr[idx]);
        print(idx+1, ls, arr);
        ls.remove(ls.size()-1);
        print(idx+1, ls, arr);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ques3 obj = new ques3();
        obj.print(0, new ArrayList<>(), arr);
    }
}
// run this file java ques3.java