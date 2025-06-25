class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int res=nums[0];
        for(int i:map.keySet()){
            if(map.get(i)==1){
                res=i;
            }
        }
        return res;
    }
}