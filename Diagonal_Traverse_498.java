class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        //ArrayList<Integer>l=new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>>map=new HashMap<>();
        int k=0;
        int m=mat.length;
        int n=mat[0].length;
        for(int j=0;j<n;j++){
            int i=0;int c=j;
            ArrayList<Integer>l=new ArrayList<>();
            while(i<m && c>=0){
                l.add(mat[i][c]);
                i++;
                c--;
            }
            map.put(k,l);
            k++;
        }
        for(int r=1;r<m;r++) {
            int i=r,j=n-1;
            ArrayList<Integer>l=new ArrayList<>();
            while (i<m && j>=0) {
                l.add(mat[i][j]);
                i++;
                j--;
            }
            map.put(k++,l);
        }
        int res[]=new int[m*n];
        int chk=0;
        int ind=0;
        for(int i:map.keySet()){
            ArrayList<Integer>l=map.get(i);
            if(chk==0){
                Collections.reverse(l);
            }
            for(int j:l){
                res[ind]=j;
                ind++;
            }
            chk=chk==0?1:0;
        }
        return res;

        

    }
}