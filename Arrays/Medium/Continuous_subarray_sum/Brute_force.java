class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(j-i+1>=2 && sum%k==0){
                    return true;
                }
            }
        }return false;
    }
}// tc -> O(n^2) sc -> O(1)