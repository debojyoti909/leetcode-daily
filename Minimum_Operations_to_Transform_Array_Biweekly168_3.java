class Solution {
    public long minOperations(int[] nums1, int[] nums2) {
        long diff=0;
        for(int i=0;i<nums1.length;i++){
            diff+=Math.abs((long)nums1[i]-(long)nums2[i]);
        }
        int lv=nums2[nums2.length-1];
        // Arrays.sort(nums1);
        // int mpos=nums1[nums1.length-1];
    long d=Long.MAX_VALUE;
        // return diff/2+mpos+1;
        for(int i=0;i<nums1.length;i++){
            long n1=nums1[i];
        long n2=nums2[i];
            long l=lv;
        // long mid=0;
            // if(n1>=n2 && n2>=l){
            //     mid=l;
            // }
            // if(n2>=)
            long max=Math.max(n1,Math.max(n2,l));
            long min=Math.min(n1,Math.min(n2,l));
            // if(n1!=max && n1!=min){
            //     mid=n1;
            // }
            // if(n2!=max && n2!=min){
            //     mid=n2;
            // }
            // if(l!=max && l!=min){
            //     mid=l;
            // }
            long mid=n1+n2+l - max-min;
            long posd=Math.abs(n1-mid)+Math.abs(n2-mid)+Math.abs(l-mid);
            // if(posd<d){
            //     d=posd;
            // }
        long posc=posd-Math.abs(n1-n2);
            if(posc<d){
                d=posc;
            }
        }
        return 1+diff+d;
    }
}