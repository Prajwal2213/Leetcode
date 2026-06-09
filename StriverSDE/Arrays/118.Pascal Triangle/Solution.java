
import java.util.*;

class Solution {
    public List<List<Integer>> generate(int n) {
        ArrayList<List<Integer>> resList = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            printPascal(i, resList);
        }
      return resList;
        
    }
    
    private void printPascal(int n,List<List<Integer>> resList){
        ArrayList<Integer> tempList = new ArrayList<>();
        int ans = 1;
        int row = n;
        
        tempList.add(ans);
        for(int col = 1; col < n; col++){
            ans = ans * (row - col);
            ans = ans / col;
            tempList.add(ans);
        }
        resList.add(tempList);
    }
}