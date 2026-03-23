import java.util.*;
public class Determine_Whether_Matrix_Can_Be_Obtained_By_Rotation_1886 {
    class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int len= mat.length;
        int count=0;
        while(count<4){
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(i>j && i!=j){
                    int temp=mat[i][j];
                    mat[i][j]=mat[j][i];
                    mat[j][i]=temp;
                }
            }
        }
        for(int i=0;i<len;i++){
            int j=0;
            int k=len-1;
            while(j<k){
                int tempp=mat[i][j];
                mat[i][j]=mat[i][k];
                mat[i][k]=tempp;
                j++;
                k--;
            }
        }
        int c=0;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(mat[i][j]==target[i][j]){
                    c++;
                }
            }
        }
        if(c==(len*len)){
            return true;
        }else{
            c=0;
        }
        count++;
        }
        return false;
    }
}
}
