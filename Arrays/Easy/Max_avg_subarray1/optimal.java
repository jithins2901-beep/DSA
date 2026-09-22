class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int cur_sum=0;
        for(int i=0;i<k;i++){
            cur_sum=cur_sum+nums[i];
        }
        int max_sum=cur_sum;
        for(int i=k;i<n;i++){
            cur_sum=cur_sum+nums[i]-nums[i-k];
            max_sum=Math.max(max_sum,cur_sum);
        }
        return (double)max_sum/k;
    }
}// tc -> O(n) sc -> O(1)