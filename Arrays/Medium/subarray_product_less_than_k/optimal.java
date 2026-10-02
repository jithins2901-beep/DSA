class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int c=0;
        int prefix=1;
        int j=0;
        if(k<=1) return 0;
        for(int i=0;i<n;i++){
            prefix=prefix*nums[i];
            while(prefix>=k){
                prefix/=nums[j];
                j++;
            }
            c+=i-j+1;
            
        }return c;
    }
}// tc -> O(n) sc -> O(1)
