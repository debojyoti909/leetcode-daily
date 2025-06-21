class Solution {
    public int minimumDeletions(String word, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        int freq[]=new int[26];
        for(int i=0;i<word.length();i++){
            //map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
            freq[word.charAt(i)-'a']++;
        }
        Arrays.sort(freq);
        int res=Integer.MAX_VALUE;
        int del=0;
        for(int i=0;i<26;i++){
            int min=freq[i];
            int temp=del;
            for(int j=25;j>i;j--){
                if(freq[j]-freq[i]<=k){
                    break;
                }
                temp=temp+freq[j]-min-k;
            }
            res=Math.min(res,temp);
            del+=min;
        }
        return res;
    }
}