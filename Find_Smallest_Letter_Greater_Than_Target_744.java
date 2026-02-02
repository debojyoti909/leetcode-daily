import java.util.*;
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char res=letters[0];
        int l=0;
        int h=letters.length-1;
        if(letters[h]<=target){
            return res;
        }
        while(l<=h){
            int mid=(l+h)/2;
            char ch=letters[mid];
            if(ch>target){
                res=ch;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return res;
    }
}