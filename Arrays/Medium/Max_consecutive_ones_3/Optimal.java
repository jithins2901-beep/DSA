class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int c=0;
        int m=0;
        int l=0;
        for(int r=0;r<n;r++){
            if(nums[r]==0){
                c++;
            }
            while(c>k){
                if(nums[l]==0){
                    c--;
                }
                l++;
            }
            m=Math.max(m,r-l+1);
        }return m;

    }
}// tc -> O(n) sc -> O(1)