class Solution {
    public int possibleStringCount(String word) {
        // HashMap<Character,Integer>map=new HashMap<>();
        // int count=1;
        // int way=1;
        // for(int i=1;i<word.length();i++){
        //     if(word.charAt(i)==word.charAt(i-1)){
        //         count++;
        //     }else{
        //    // map.put(word.charAt(i-1),Math.max(map.getOrDefault(word.charAt(i-1),0),count));
        //         way*=(count);
        //         count=1;
        //     }
        // }
        // // map.put(word.charAt(word.length()-1),Math.max(map.getOrDefault(word.charAt(word.length()-1),0),count));
        // // int c=1;
        // // for(int i:map.values()){
        // //     c*=(i+1);
        // //         }
        // way*=(count);
        // return way;
            
        int n=word.length();
        int res=n;
        for(int i=1;i<n;i++){
            if(word.charAt(i)!=word.charAt(i-1)){
                res--;
            }
        }
        return res;
        }
}