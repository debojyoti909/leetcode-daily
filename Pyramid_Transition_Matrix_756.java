public class Pyramid_Transition_Matrix_756 {
    class Solution {
    public boolean pyramidTransition(String bottom, List<String> allowed) {
        HashMap<String,ArrayList<Character>>map=new HashMap<>();
        for(String s:allowed){
            String key=s.substring(0,2);
            char val=s.charAt(2);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(val);
        }
        StringBuilder sb=new StringBuilder();
        return solve(bottom,map,sb,0);
    }
    public boolean solve(String bottom,HashMap<String,ArrayList<Character>>map,StringBuilder sb,int idx){
        if(bottom.length()==1){
            return true;
        }
        if(sb.length()==bottom.length()-1){
            return solve(sb.toString(),map,new StringBuilder(),0);
        }
        String key=bottom.substring(idx,idx+2);
        if(!map.containsKey(key)){
            return false;
        }
        for(char ch:map.get(key)){
            sb.append(ch);
            if(solve(bottom,map,sb,idx+1)){
                return true;
            }
            sb.deleteCharAt(idx);
        }
        return false;

    }
}
}
