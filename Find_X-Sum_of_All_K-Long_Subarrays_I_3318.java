class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int res[]=new int[nums.length-k+1];
        for(int i=0;i<=nums.length-k;i++){
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int j=i;j<i+k;j++){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            }
            ArrayList<int[]>l=new ArrayList<>();
            for(Map.Entry<Integer,Integer>m:map.entrySet()){
                l.add(new int[]{m.getValue(),m.getKey()});
            }
            l.sort((a,b)->b[0]!=a[0]?b[0]-a[0]:b[1]-a[1]);
            int s=0;
            for(int j=0;j<x && j<l.size();j++){
                s+=l.get(j)[0]*l.get(j)[1];
            }
            res[i]=s;
        }
        return res;
    }
}