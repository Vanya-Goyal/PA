package Revision;

import java.util.Map;

public class ques1 {
 
    public int totalfruits(int[] fruits){
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int maxlen= 0;
        for(int right =0;right< fruits.length; right++){
            map.put(fruits[right], map.getOrDefault(fruits[right],0)+1);

            if(map.size() > 2){
                while(map.size() >2){
                    map.put(fruits[left], map.getOrDefault(fruits[left],0)-1);
                    if(map.get(fruits[left])==0){                       
                    map.remove(fruits[left]);
                    }
                left++;
                }
            }
            if(map.size() <=2){
                maxlen = Math.max(maxlen, right - left +1);
            }
        }  
        return maxlen;      
    }
}
