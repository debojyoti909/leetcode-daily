class Solution {
    public static int totaltime(int piles[],int time){
        int total=0;
        for(int i=0;i<piles.length;i++){
            // total=total+(piles[i]/time);
            // if(piles[i]%time !=0){
            //     total++;
            // }
            total += (piles[i] + time - 1) / time; 
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        int low=1;
        int high=max;
        //int ans=max;
        while(low<high){
            //int mid=(low+high)/2;
            int mid=low+(high-low)/2;
            int total=totaltime(piles,mid);
            if(total<=h){
                //ans=mid;
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
