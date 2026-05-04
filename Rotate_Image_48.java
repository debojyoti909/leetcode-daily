public class Rotate_Image_48 {
    class Solution {
    public void rotate(int[][] matrix) {
        int len= matrix.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(i>j && i!=j){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
        for(int i=0;i<len;i++){
            int j=0;
            int k=len-1;
            while(j<k){
                int tempp=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k]=tempp;
                j++;
                k--;
            }
        }
    }
}
}
