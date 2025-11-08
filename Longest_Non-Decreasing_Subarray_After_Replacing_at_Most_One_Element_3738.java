class Solution {
    public int longestSubarray(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int res=1;
        int a=0;
        Deque<Integer>q=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i-1]>nums[i]){
                q.addLast(i-1);
            }
            int chk=0;
            //while(chk)
            while(true){
                while(!q.isEmpty()&& q.peekFirst()<a){
                    q.pollFirst();
                }
                if(q.isEmpty()){
                    chk=1;
                }else if(q.size()>=2){
                    chk=0;
                }else{
                    int ind=q.peekFirst();
                    int l=0;
                    int r=0;
                    //l=(ind==a)?(ind>1)
                    if(ind==a){
                        l=1;
                    }else if(ind-1>=0 && ind+1<nums.length && nums[ind-1]<=nums[ind+1]){
                        l=1;
                    }
                    if(ind+1==i ){
                        r=1;
                    }else if(ind+2<nums.length && nums[ind]<=nums[ind+2]){
                        r=1;
                    }
                    //int chk=0;
                    if(l==1||r==1){
                        chk=1;
                    }else{
                        chk=0;
                    }
                    
                }
                if(chk==1){
                        break;
                    }else{
                        a++;
                    }
                // int ml=i-a+1;
                // res=Math.max(ml,res);
            }
                            int ml=i-a+1;
                res=Math.max(ml,res);
        }
        return res;
        
    }
}