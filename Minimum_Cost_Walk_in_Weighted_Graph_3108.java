class DSU{
    int rank[];
    int parent[];
    DSU(int n){
        rank=new int[n];
        parent=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
    }
    public int findp(int node){
        if(node==parent[node]){
            return node;
        }
        parent[node]=findp(parent[node]);
        return parent[node];
    }
    public void union(int u,int v){
        int ulp_u=findp(u);
        int ulp_v=findp(v);
        if(ulp_u==ulp_v){
            return;
        }
        if(rank[ulp_u]<rank[ulp_v]){
            parent[ulp_u]=ulp_v;
        }else if(rank[ulp_u]>rank[ulp_v]){
            parent[ulp_v]=ulp_u;
        }else{
            parent[ulp_v]=ulp_u;
            rank[ulp_u]++;
        }
    }
}

class Solution {
    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        DSU dsu=new DSU(n);
        int cost[]=new int[n];
        for(int edge[]:edges){
            dsu.union(edge[0],edge[1]);
        }
        Arrays.fill(cost,Integer.MAX_VALUE);
        for(int edge[]:edges){
            int par=dsu.findp(edge[0]);
            cost[par]=cost[par] & edge[2];
        }
        int res[]=new int[query.length];
        //for(int queryy[]:query){
        for(int i=0;i<query.length;i++){
            int par1=dsu.findp(query[i][0]);
            int par2=dsu.findp(query[i][1]);
            if(par1!=par2){
                res[i]=-1;
            }else{
                res[i]=cost[par1];
            }
        }
        return res;
    }
}