class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer>l=new ArrayList<>();
        for(int x:nums){
            List<Integer>t=new ArrayList<>();
            while(x>0){
                t.add(x%10);
                x/=10;
            }
            for(int i=t.size()-1;i>=0;i--){
                l.add(t.get(i));
            }
        }
        int res[]=new int[l.size()];
        for(int i=0;i<res.length;i++){
            res[i]=l.get(i);
        }
        return res;
    }
}