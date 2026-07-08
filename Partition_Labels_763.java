class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        //int arr[]=new int[]
        List<Integer>l=new ArrayList<>();
        int ind=0;
        int tar=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            int maxi=map.get(ch);
            tar=Math.max(tar,maxi);
            if(j==tar){
                //ind=j+1;
                l.add(j-ind+1);
                ind=j+1;
            }
        }
       // l.add(s.length()-ind);
        return l;
    }
}