public class Minimum_Penalty_for_a_Shop_2483 {
    class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length();
        int pop[]=new int[n];
        int pcl[]=new int[n];
        if(customers.charAt(0)=='N'){
            pop[0]=1;
        }
            for(int i=1;i<n;i++){
                pop[i]=pop[i-1];
                if(customers.charAt(i)=='N'){
                    pop[i]+=1;
                }
            }
        
        if(customers.charAt(n-1)=='Y'){
            pcl[n-1]=1;
        }
            for(int i=n-2;i>=0;i--){
                pcl[i]=pcl[i+1];
                if(customers.charAt(i)=='Y'){
                    pcl[i]+=1;
                }
            }
        
        int pen=pcl[0];
        int res=0;
        for(int i=1;i<n;i++){
            int tres=pop[i-1]+pcl[i];
            if(tres<pen){
                pen=tres;
                res=i;
            }
        }
        if(pop[n-1]<pen){
            return n;
        }
        return res;
    }
}
}
