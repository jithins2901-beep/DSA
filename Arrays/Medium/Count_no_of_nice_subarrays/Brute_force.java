class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            int od=0;
            for(int j=i;j<n;j++){
                if(nums[j]%2!=0){
                    od++;
                }
                if(od==k){
                    c++;
                }
                if(od>k){
                    break;
                }
            }
        }return c;
    }
}// tc -> O(n^2) sc -> O(1)