package July24;
import java.util.*;
class ques4 {
    public List<Integer> generateRows(int row){
        List<Integer> ansRows = new ArrayList<>();
        ansRows.add(1);
        int ans = 1;
        for(int col=1; col< row; col++){
            ans = ans * (row-col);
            ans = ans / col;
            ansRows.add(ans);
        }
        return ansRows;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1; i<= numRows; i++){
            ans.add(generateRows(i));
        }
        return ans;
    }
}