class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0){
                continue;
            }
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    if(i==j || j==k || i==k){
                        continue;
                    }
                    int num=digits[i]*100+digits[j]*10+digits[k];
                    if(num>=100 && num%2==0){
                        set.add(num);
                    }
                }
            }
        }
        int res[]=new int[set.size()];
        int i=0;
        for(int val:set){
            res[i]=val;
            i++;
        }
        Arrays.sort(res);
        return res;
    }
}