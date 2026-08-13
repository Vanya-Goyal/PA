package Aug7;
import java.util.*;

public class letter_combinations {
    String[]  map = {"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public void backtrack(String digits, int index, StringBuilder curr, List<String> ans){
        if(index == digits.length()){
            ans.add(curr.toString());
            return;
        }
        String letters = map[digits.charAt(index) - '0'];
        for(int i=0; i<letters.length(); i++){
            curr.append(letters.charAt(i));
            backtrack(digits, index+1, curr, ans);
            curr.deleteCharAt(curr.length()-1);
        }
    }
    public List<String> letterCombinations(String digits){
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0) return ans;
        backtrack(digits,0, new StringBuilder(), ans);
        return ans;
    }
}
