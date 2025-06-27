class Solution {
    public String generateTag(String caption) {
        StringBuilder sb=new StringBuilder();
        sb.append('#');
        String arr[]=caption.trim().split("\\s+");
        //sb.append('#');
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            if(i==0){
                sb.append(word.toLowerCase());
            }else{
                char first=Character.toUpperCase(word.charAt(0));
                String rest = word.substring(1).toLowerCase();
                sb.append(first).append(rest);
            }
        }
        if(sb.toString().length()>100){
            return sb.toString().substring(0,100);
        }else{
            return sb.toString();
        }
    }
}