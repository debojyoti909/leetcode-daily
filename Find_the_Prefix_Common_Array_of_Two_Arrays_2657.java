class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer>set=new HashSet<>();
        int arr[]=new int[A.length];
        // for(int i=0;i<A.length;i++){
        //     set.add(A[i]);
        //     int cnt=0;
        //     for(int j=0;j<=i;j++){
        //         if(set.contains(B[j])){
        //             cnt++;
        //         }
        //     }
        //     arr[i]=cnt;
        // }
        // return arr;
        for(int i=0;i<A.length;i++){
            set.add(A[i]);
            set.add(B[i]);
            arr[i]=(i+1)*2-set.size();
        }
        return arr;
    }
}