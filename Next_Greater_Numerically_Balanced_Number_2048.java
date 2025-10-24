public class Next_Greater_Numerically_Balanced_Number_2048 {
    
    boolean chk(int n1){
        int arr[]=new int[10];
        //int n1=n;
        while(n1>0){
            arr[n1%10]++;
            n1=n1/10;
        }
        for(int i=0;i<10;i++){
            if(arr[i]>0&& arr[i]!=i){
                return false;
            }
        }
        return true;
    }
    public int nextBeautifulNumber(int n) {
        int arr[]=new int[10];
        int n1=n;
        // while(n1>0){
        //     arr[n1%10]++;
        //     n1=n1/10;
        // }
        for(int i=n+1;i<=1224444;i++){
            if(chk(i)){
                return i;
            }
        }
        return -1;
    }
}

