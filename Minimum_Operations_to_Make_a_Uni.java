public class Minimum_Operations_to_Make_a_Uni-Value_Grid_2033_2 {
    class Solution {
    public int minOperations(int[][] grid, int x) {
        int m=grid.length;
        int n=grid[0].length;
        int arr[]=new int[m*n];
        int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[k]=grid[i][j];
                k++;
            }
        }
        Arrays.sort(arr);
        int med=arr[m*n/2];
        int op=0;
        for(int num:arr){
            int d=Math.abs(num-med);
            if(d%x!=0){
                return -1;
            }
            op+=d/x;
        }
        return op;
    }
}
}
