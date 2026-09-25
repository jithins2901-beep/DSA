class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int minl=Integer.MAX_VALUE;
        int sum=0;
        int j=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            while(sum>=target){
                /*
                if(i-j+1<minl){
                    minl=i-j+1;
                }

                or
                
                */
                minl=Math.min(minl,i-j+1);
                sum-=nums[j];
                j++;
            }
        }return minl==Integer.MAX_VALUE?0:minl;
    }
}// tc -> O(n) sc -> O(1) 
//even though we have two loops but the inner loop is not executed for every iteration of outer loop. The inner loop is executed only when the sum is greater than or equal to target. So, the time complexity is O(n).