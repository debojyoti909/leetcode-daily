public class Search_in_Rotated_Sorted_Array_33 {
    class Solution {
    public static int searchRotatedSortedArray(int arr[],int target,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid = si +(ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[si]<=arr[mid]){
            if(arr[si]<=target && target<=arr[mid]){
                return searchRotatedSortedArray(arr, target, si, mid-1);
            }
            else{
                return searchRotatedSortedArray(arr, target, mid+1, ei);
            }
        }
        else{
            if(arr[mid]<=target && target<=arr[ei]){
                return searchRotatedSortedArray(arr, target, mid+1, ei);
            }
            else{
                return searchRotatedSortedArray(arr, target, si, mid-1);
            }
        }
    }
    public int search(int[] nums, int target) {
        return searchRotatedSortedArray(nums,target,0,nums.length-1);
        // int chk=0;
        // int a=0;
        // int n = nums.length;
        // int lp=0;
        // int up=n;
        // if(target==nums[0]){
        //     return 0;
        // }
        // else if(target>nums[0]){
        //     if(n%2==0){
        //         lp=0;
        //         up=(n/2);
        //     }else{
        //         lp=0;
        //     up=(n-1)/2+1;
        //     }
            
        // }
        // else{
        //     if(n%2==0){
        //         lp=(n/2)-1;
        //         up=n-1;
        //     }
        //     else{
        //     lp=((n-1)/2);
        //     up=n-1;
        //     }
        // }

        // while(lp<=up){
        //     int mp = (lp+up)/2;
        //     if(target == nums[mp]){
        //         chk=1;
        //         a=mp;
        //         break;
        //     }
        //     else if(target > nums[mp]){
        //         lp= mp+1;
        //     }
        //     else{
        //         up=mp-1;
        //     }
        // }
        // if(chk==1){
        //     return a;
        // }
        // else{
        //     return -1;
        // }
        
        // int l=0,r=nums.length-1,mid;
        // while(l<=r) {
        //     mid=(l+r)/2;
        //     if(nums[mid]==target) {
        //         return mid;
        //     }
        //     else if(nums[l]<=nums[mid]) {
        //         if(target>=nums[l] && target<=nums[mid]) {
        //             r=mid-1;
        //         }
        //         else{
        //             l=mid+1;
        //         }
        //     }
        //     else {
        //         if(target<=nums[r] && target>=nums[mid]) {
        //             l=mid+1;
        //         }
        //         else {
        //             r=mid-1;
        //         }
        //     }
        // }
        // return -1;
    }
}
    
}
