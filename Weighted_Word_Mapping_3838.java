public class Weighted_Word_Mapping_3838 {
    class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            String ch=words[i];
            int sum=0;
            for(int j=0;j<ch.length();j++){
                char c=ch.charAt(j);
                int num=c-'a';
                sum+=weights[num];
            }
            int mod=sum%26;
            sb.append((char)('z'-mod));
        }
        return sb.toString();
    }
}
}
