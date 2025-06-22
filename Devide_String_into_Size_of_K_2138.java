class Solution {
    public String[] divideString(String s, int k, char fill) {
      int n=s.length();
      int po=n/k;
      int m=po;
      int modc=n%k;
      //ArrayList<String>l=new ArrayList<>();
      if(modc!=0){
        m=po+1;
      }
      String arr[]=new String[m];
      int in=0;
      for(int i=0;i<po;i++){
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<k;j++){
            sb.append(s.charAt(i*k+j));
        }
        arr[in]=sb.toString();
        in++;
      }
      //int mod=s.length()%k;
      if (modc!=0){
            StringBuilder sb = new StringBuilder();
            int start=po*k; 
            for (int i=0;i<k;i++){
                if(start+i<n){
                    sb.append(s.charAt(start+i));
                }else{
                    sb.append(fill);
                }
            }
            arr[in]=sb.toString();
        }
      return arr;
    }
}