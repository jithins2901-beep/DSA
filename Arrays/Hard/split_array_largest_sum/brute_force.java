class Solution {
    public int findsub(int nums[],int maxsum){
        int subarrays=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=maxsum){
                sum+=nums[i];
            }else{
                subarrays++;
                sum=nums[i];
            }
        }return subarrays;
    }
    public int splitArray(int[] nums, int k) {
        int maxi=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            maxi=Math.max(maxi,nums[i]);
            sum+=nums[i];
        }
        for(int maxsum=maxi;maxsum<=sum;maxsum++){
            int subarrays=findsub(nums,maxsum);
            if(subarrays<=k){
                return maxsum;
            }
        }return -1;
    }
}// tc -> O(n*(sum-maxi)) sc -> O(1)
