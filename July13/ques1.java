package July13;

import java.util.HashSet;

public class ques1 {
    
    public static int lengthOf(String s){
        int left = 0;
        int right = 0;

        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;

        for( right =0; right < s.length(); right++){
            char c = s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
    }
}
