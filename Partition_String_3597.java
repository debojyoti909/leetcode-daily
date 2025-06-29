class Solution {
    public List<String> partitionString(String s) {
        List<String>l=new ArrayList<>();
        //List<String>seen=new ArrayList<>();
        HashSet<String>seen=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            sb.append(ch);
            if(!seen.contains(sb.toString())){
                l.add(sb.toString());
                seen.add(sb.toString());
                sb.setLength(0);
            }
        }
        return l;
    }
}