class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(nums[j]==nums[i]){
                    c++;
                }
            }if(c==1) return nums[i];
        }return -1;
    }
}// tc -> O(n^2) sc -> O(1)