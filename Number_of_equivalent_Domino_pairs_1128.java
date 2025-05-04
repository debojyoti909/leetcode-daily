import java.util.*;
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
     HashMap<String,Integer>map=new HashMap<>();
     for(int i=0;i<dominoes.length;i++){
        if(dominoes[i][0]<dominoes[i][1]){
            // map.put(new int[]{dominoes[i][0],dominoes[i][1]},map.getOrdefault(new int[]{dominoes[i][0],dominoes[i][1]},0)+1);
            String s=dominoes[i][0]+"-"+dominoes[i][1];
            map.put(s,map.getOrDefault(s,0)+1);
        }else{
            // map.put(new int[]{dominoes[i][1],dominoes[i][0]},map.getOrdefault(new int[]{dominoes[i][1],dominoes[i][0]},0)+1);
            String s=dominoes[i][1]+"-"+dominoes[i][0];
            map.put(s,map.getOrDefault(s,0)+1);
        }
     }  
     int count=0; 
     for(int a:map.values()){
        count+=a*(a-1)/2;
     }
     return count;
    }
}