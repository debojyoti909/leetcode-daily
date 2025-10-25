class Solution {
    public int totalMoney(int n) {
        int cnt=0;
        int chk=0;
        int sum=0;
        while(n>0){
        for(int i=1;i<=7 && n>0;i++){
            
                sum+=(i+cnt);
                n--;
            
        }

        cnt++;
        }
        return sum;
    }
}