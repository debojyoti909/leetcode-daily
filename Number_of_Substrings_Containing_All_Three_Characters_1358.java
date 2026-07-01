class Solution {
    public int numberOfSubstrings(String s) {
       // Hashmap<Character,Integer>map = new HashMap<>();
        int freq[]=new int[3];
        int res=0;
        int abc=0;
        int low=0;
        int high=0;
        for(high=0;high<s.length();high++){
            char ch=s.charAt(high);
            // map.put(ch,1);
            // if(map.get(ch)==1){
            //     abc++;
            // }
            freq[ch-'a']++;
            if(freq[ch-'a']==1){
                abc++;
            }
            // if(abc==3){
            //     res+=s.length()-high;
            //     low++;
            // }
            while(abc==3){
                res+=s.length()-high;
                char prev=s.charAt(low);
                low++;
                freq[prev-'a']--;
                if(freq[prev-'a']==0){
                    abc--;
                }
            }
        }
        return res;
    }
}