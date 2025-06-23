class Solution {
    public int cswap(int arr[],int t[]){
        int c=0;
        for(int i=0;i<arr.length;i++){
            c+=Math.abs(arr[i]-t[i]);
        }
        return c;
    }
    public int minSwaps(int[] nums) {
        int evc=0;
        int oddc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                evc++;
            }else{
                oddc++;
            }
        }
        if(Math.abs(evc-oddc)>1){
            return -1;
        }
        // for(int i=0;i<nums.length;i++){
        //     if(oddc>evc){
        //         cswap()
        //     }
        // }
        int odd[]=new int[oddc];
        int ev[]=new int[evc];
        int m=0;
        int n=0;
        //int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ev[m]=i;
                m++;
            }else{
                odd[n]=i;
                n++;
            }
        }
        // int t[]=new int[oddc];
        // for(int i=0;i<oddc;i++){
        //     t[i]=2*i;
        // }
        int res=Integer.MAX_VALUE;
        if(oddc>=evc){
            int t[]=new int[oddc];
            for(int i=0;i<oddc;i++){
                t[i]=2*i;
            }
            res=Math.min(res,cswap(odd,t));
        }
        //else{
        if(evc>=oddc){
            int t[]=new int[evc];
            for(int i=0;i<evc;i++){
                t[i]=2*i;
            }
            res=Math.min(res,cswap(ev,t));
        }
        return res;
    }
}