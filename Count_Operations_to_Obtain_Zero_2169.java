class Solution {
    public int countOperations(int num1, int num2) {
        int op=0;
        while(num2!=0 && num1!=0){
            if(num2>=num1){
                num2-=num1;
            }else{
                num1-=num2;
            }
            op++;
        }
        return op;
    }
}