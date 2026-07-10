class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        //HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<int []>l=new ArrayList<>();
        int n=nums1.length;
        int m=nums2.length;
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(nums1[i][0]==nums2[j][0]){
                l.add(new int[]{nums1[i][0],nums1[i][1]+nums2[j][1]});
            i++;
            j++;
            }else if(nums1[i][0]<nums2[j][0]){
                l.add(new int[]{nums1[i][0],nums1[i][1]});
            i++;
            }else{
                l.add(new int[]{nums2[j][0],nums2[j][1]});
                j++;
            }
        }
        while(i<n){
            l.add(new int[]{nums1[i][0],nums1[i][1]});
            i++;
        }
        while(j<m){
            l.add(new int[]{nums2[j][0],nums2[j][1]});
                j++;
        }
        int arr[][]=new int[l.size()][2];
        for(int k=0;k<l.size();k++){
            arr[k]=l.get(k);
        }
        return arr;
    }
}