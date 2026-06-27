class Solution {
    public int minMaxDifference(int num) {
    int[] nums=String.valueOf(num).chars()
                .map(c->c-'0')
                .toArray();
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=9){
                max=nums[i];
                break;
            }
        }
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                sb1.append('9');
            }else{
                sb1.append(nums[i]);
            }
        }
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==min){
                sb2.append('0');
            }else{
                sb2.append(nums[i]);
            }
        }
        return Integer.parseInt(sb1.toString())-Integer.parseInt(sb2.toString());

    }
}