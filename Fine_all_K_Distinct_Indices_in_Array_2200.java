class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                int low=Math.max(0,i-k);
                int high=Math.min(nums.length-1,i+k);
                for(int j=low;j<=high;j++){
                    set.add(j);
                }
            }
        }
        ArrayList<Integer>l=new ArrayList<>();
        for(int i:set){
            l.add(i);
        }
        Collections.sort(l);
        return l;
    }
}