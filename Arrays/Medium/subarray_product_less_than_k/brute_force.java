class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int c=0;
        
        for(int i=0;i<n;i++){
            int prefix=1;
            for(int j=i;j<n;j++){
                prefix=prefix*nums[j];
                if(prefix<k){
                    c++;
                }else{
                    break;
                }
            }
        }return c;
    }
}// tc -> O(n^2) sc -> O(1)
