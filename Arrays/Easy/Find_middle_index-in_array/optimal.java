class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int r=0;
        for(int i:nums){
            r+=i;
        }
        int l=0;
        for(int i=0;i<n;i++){
            r-=nums[i];
            if(l==r){
                return i;
            }
            l+=nums[i];
        }
        return -1;
    }
}// tc -> O(n) sc -> O(1)