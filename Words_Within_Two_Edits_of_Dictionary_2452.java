import java.util.ArrayList;
import java.util.List;

public class Words_Within_Two_Edits_of_Dictionary_2452 {
    class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        ArrayList<String>l=new ArrayList<>();
        for(String a:queries){
            //int diff=0;
            for(String b:dictionary){
                int diff=0;
                for(int i=0;i<a.length();i++){
                    if(a.charAt(i)!=b.charAt(i)){
                        diff++;
                    }
                    if(diff>2){
                    break;
                }
                }
                
                if(diff<=2){
                    l.add(a);
                    break;
                }
            }
        }
        return l;

    }
}
}
