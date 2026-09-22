class Solution {
        public int[] limitOccurrences(int[] nums, int k) {
            int n=nums.length;
            int j=0;
            for(int i=0;i<n;i++){
                if(j<k || nums[j-k]!=nums[i]){
                    nums[j++]=nums[i];
                }
            }
            return Arrays.copyOf(nums, j);
        }// tc -> O(n) sc -> O(1)
} 