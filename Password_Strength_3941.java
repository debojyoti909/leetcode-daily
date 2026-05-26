class Solution {
    public int passwordStrength(String password) {
        int res=0;
        HashSet<Character>s=new HashSet<>();
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(!s.contains(ch)){
                s.add(ch);
            }else{
                continue;
            }
            int cn=(int)ch;
            if(cn>=48 && cn<=57){
                res+=3;
            }else if(cn>=65 && cn<=90){
                res+=2;
            }else if(cn>=97 && cn<=122){
                res+=1;
            }else{
                res+=5;
            }
        }
        return res;
    }
}