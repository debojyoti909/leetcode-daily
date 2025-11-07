import java.util.*;
class Minimum_Time_to_Make_Rope_Colorful_1578 {
    static int minCost(String colors, int[] neededTime) {
        int res=0;
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i)==colors.charAt(i-1)){
                res+=(Math.min(neededTime[i],neededTime[i-1]));
                neededTime[i]=Math.max(neededTime[i],neededTime[i-1]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int neededTime[]=new int[]{1,2,3,4,5};
        String colors="aabaa";
        int res=minCost(colors,neededTime);
        System.out.println(res);
    }
}