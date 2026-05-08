class Solution {
    public static boolean []isPrime;
    void sieve(int a){
        isPrime=new boolean[a+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int num=2;num*num<=a;num++){
            if(isPrime[num]){
                for(int m=num*num;m<=a;m+=num){
                    isPrime[m]=false;
                }
            }
        }

    }
    public int minJumps(int[] nums) {
     int n= nums.length;
    HashMap<Integer, List<Integer>>map=new HashMap<>();
    int ma=0;
    for(int i=0;i<n;i++){
      //  map.put(nums[i],i);
      map.putIfAbsent(nums[i], new ArrayList<>());
map.get(nums[i]).add(i);
    ma=Math.max(ma,nums[i]);
    }
    sieve(ma);

    Queue<Integer>q=new LinkedList<>();
    boolean[] visited = new boolean[n];
    Arrays.fill(visited,false);
    q.offer(0);
    visited[0]=true;
    HashSet<Integer>seen=new HashSet<>();
    int step=0;
    while(!q.isEmpty()){
        int s=q.size();
        while(s-->0){
            int i=q.peek();
            q.poll();
            if(i==n-1){
                return step;
            }
            if(i-1>=0 && !visited[i-1]){
                q.offer(i-1);
                visited[i-1]=true;
            }
            if(i+1<=n-1 && !visited[i+1]){
                q.offer(i+1);
                visited[i+1]=true;
            }
            if(!isPrime[nums[i]] || seen.contains(nums[i])){
                continue;
            }
            if(seen.contains(nums[i])){
                continue;
            }
            for(int m=nums[i]; m<=ma;m+=nums[i]){
                if(!map.containsKey(m)){
                    continue;
                }
                for(int j:map.get(m)){
                    if(!visited[j]){
                        q.offer(j);
                        visited[j]=true;
                    }
                }
            }
            seen.add(nums[i]);
        }
        step++;
    }
    return -1;
    }
}