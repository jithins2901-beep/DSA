class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int minl=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+nums[j];
                if(sum>=target){
                    minl=Math.min(minl,j-i+1);
                }
            }
        }return minl==Integer.MAX_VALUE?0:minl;
    }
}// tc -> O(n^2) sc -> O(1)