class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);
        int i=0;
        int j=0;
        int maxh=1;
        int maxv=1;
        int cnt1=1;
        int cnt2=1;
        while(i<hBars.length-1 || j<vBars.length-1){
            if(i<hBars.length-1){
                if(hBars[i+1]-hBars[i]==1){
                    cnt1++;
                }else{
                    maxh=Math.max(maxh,cnt1);
                    cnt1=1;
                }
                i++;
            }
            if(j<vBars.length-1){
                if(vBars[j+1]-vBars[j]==1){
                    cnt2++;
                }else{
                    maxv=Math.max(maxv,cnt2);
                    cnt2=1;
                }
                j++;
            }
        }
        maxh=Math.max(maxh,cnt1);
        maxv=Math.max(maxv,cnt2);
        int side=Math.min(maxh,maxv)+1;
        return side*side;
    }
}