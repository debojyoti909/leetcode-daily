class Solution {
    public int numberOfBeams(String[] bank) {
        //HashMap<Int,Int>map=new HashMap<>();
        int arr[]=new int[bank.length];
        for(int i=0;i<bank.length;i++){
            String s=bank[i];
            int cnt=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1'){
                    cnt++;
                }
            }
            arr[i]=cnt;
            //map.put(i,cnt);
        }
        int sum=0;
        int i=0;
        int prev=0;
        while (prev < arr.length && arr[prev] == 0) prev++;
        for(int cur=prev+1;cur<arr.length;cur++){
            if(arr[cur]!=0){
                sum+=arr[prev]*arr[cur];
                prev=cur;
            }
        }
        //int prev=0;
        // int cur=0;
        // while(cur!=arr.length){
        //     //cur=cur+1;
        //     if(arr[cur]==0){
        //         continue;
        //     }
        //     sum+=(arr[cur]*arr[prev]);
        //     prev=cur;
        //     cur=cur+1;
        // }
        return sum;
    }
}