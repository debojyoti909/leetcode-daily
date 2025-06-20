class Solution {
    public int maxDistance(String s, int k) {
       //HashMap<Integer,int arr[]>map=new HashMap<>();
        int x1=0;
        int x2=0;
        int y1=0;
        int y2=0;
        int dup=k;
        int maxdis=Integer.MIN_VALUE;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='N'){
               y1++;
           }else if(s.charAt(i)=='S'){
               y2++;
           }else if(s.charAt(i)=='W'){
               x2++;
           }else{
               x1++;
           }
           //int mad=(int)Math.abs((double)x-(double)y);
           int x3=(int)Math.abs((double)x1-(double)x2);
           int y3=(int)Math.abs((double)y1-(double)y2);
           int d=x3+y3;
           int chgx=Math.min(x1,x2);
           int chgy=Math.min(y1,y2);
           int chgd=chgx+chgy;
           int chgres=Math.min(dup,chgd)*2;
           //dup--;
           int maxd=d+chgres;
           int posmax=Math.min(maxd,i+1);
           maxdis=Math.max(posmax,maxdis);
        
       } 
        return maxdis;
    }
}