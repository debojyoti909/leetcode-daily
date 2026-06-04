class Solution {
    public int countf(int num){
        char arr[]=String.valueOf(num).toCharArray();
        int c=0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                c++;
            }else if(arr[i]<arr[i-1] && arr[i]<arr[i+1]){
                c++;
            }
        }
        return c;
    }
    public int totalWaviness(int num1, int num2) {
        int res=0;
        for(int i=num1;i<=num2;i++){
            res+=countf(i);
        }
        return res;
    }
}