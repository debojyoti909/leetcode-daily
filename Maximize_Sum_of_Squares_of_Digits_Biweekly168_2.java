class Solution {
    public String maxSumOfSquares(int num, int sum) {
        //int arr[][]=new int[num][sum];
        long max=9L*num;
        if(sum>max){
            return "";
        }
        //else{
            long sl=sum;
            StringBuilder res=new StringBuilder(num);
            for(int i=0;i<num;i++){
                // int pos=num-i;
                // int rem=num-1;
                int rem=num-i-1;
                int m=0;
                if(i==0 && num>1){
                    //if(nu)
                    m=1;
                }
                int chk=0;
                //int diff[]=new int[9];
                for(int j=9;j>=m;j--){
                  long nes=sl-j;
                    if(nes<0){
                        continue;
                    }
                    long pos=9L*rem;
                    if(nes<=pos){
                        res.append((char)('0'+j));
                        //sum-=j;
                        sl=sl-j;
                        chk=1;
                break;
                    }
                }
             if(chk==0){
                 return "";
             }   
            }
            // return res.toString();
        //}
        return res.toString();
    }
}