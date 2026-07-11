class Solution {
    class DSU{
        int parent[];
        int size[];
        DSU(int n){
            parent=new int[n];
            size=new int[n];
            for(int i=0;i<n;i++){
                parent[i]=i;
            }
            Arrays.fill(size,1);
        }
        int find_par(int u){
            if(parent[u]==u){
                return u;
            }
            parent[u]=find_par(parent[u]);
            return parent[u];
        }
        void union(int u,int v){
            int ulp_u=find_par(u);
            int ulp_v=find_par(v);
            if(ulp_u==ulp_v){
                return;
            }
            if(size[ulp_u]<size[ulp_v]){
                parent[ulp_u]=ulp_v;
                size[ulp_v]+=size[ulp_u];
            }else{
                parent[ulp_v]=ulp_u;
                size[ulp_u]+=size[ulp_v];
            }
        }
    }
    public int countCompleteComponents(int n, int[][] edges) {
        DSU dsu=new DSU(n);
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int edge[]:edges){
            dsu.union(edge[0],edge[1]);
        }
        for(int edge[]:edges){
            int root=dsu.find_par(edge[0]);
            map.put(root,map.getOrDefault(root,0)+1);
        }
        int count=0;
        //vertex traversal
        for(int i=0;i<n;i++){
            if(dsu.parent[i]==i){
                int nodes=dsu.size[i];
                int pos=nodes*(nodes-1)/2;
                int curr=map.getOrDefault(i,0);
                if(pos==curr){
                    count++;
                }
            }
        }
        return count;
    }
}