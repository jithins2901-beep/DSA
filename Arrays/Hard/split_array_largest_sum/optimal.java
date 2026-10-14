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
        int low=maxi;
        int high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            int subarrays=findsub(nums,mid);
            if(subarrays>k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }return low;
    }
}// tc -> O(n*log(sum-maxi)) sc -> O(1)
