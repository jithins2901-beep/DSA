class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int c=0;
        int m=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                c++;
                m=Math.max(m,c);
            }else{
                c=0;
            }
        }return m;
    }
}// tc -> O(n) sc -> O(1)