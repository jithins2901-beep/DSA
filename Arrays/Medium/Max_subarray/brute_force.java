class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int m=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                m=Math.max(m,sum);
            }
        }return m;
    }
}//tc -> O(n^2) sc -> O(1)