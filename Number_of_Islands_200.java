class Solution {
    class Pair{
        int r;
        int c;
        public Pair(int a,int b){
            this.r=a;
            this.c=b;
        }
    }
    public void BFS(int r,int c,int vis[][],char grid[][]){
        vis[r][c]=1;
        Queue<Pair>q=new LinkedList<Pair>();
        q.add(new Pair(r,c));
        int n=grid.length;
        int m=grid[0].length;
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        while(!q.isEmpty()){
            Pair p=q.poll();
            int row=p.r;
            int col=p.c;
            for(int i=0;i<4;i++){
                    int nr=row+dr[i];
                    int nc=col+dc[i];
                    if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]==0 && grid[nr][nc]=='1'){
                        vis[nr][nc]=1;
                        q.add(new Pair(nr,nc));
                    }
                
            }
        }

    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    cnt++;
                    BFS(i,j,vis,grid);
                }
            }
        }
        return cnt;

    }
}