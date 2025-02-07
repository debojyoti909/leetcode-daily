import java.util.*;
class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer,Integer>ball=new HashMap<>();
        HashMap<Integer,Integer>color=new HashMap<>();
        int res[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int balln=queries[i][0];
            int col=queries[i][1];
            if(!ball.containsKey(balln)){
                ball.put(balln,col);
                color.put(col,color.getOrDefault(col,0)+1);
            }else{
                int rball=ball.get(balln);
                ball.put(balln,col);
                color.put(col,color.getOrDefault(col,0)+1);
                color.put(rball,color.get(rball)-1);
                if(color.get(rball)==0){
                    color.remove(rball);
                }
            }
            res[i]=color.size();

        }
        return res;
    }
}