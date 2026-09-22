class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(nums[j]==nums[i]){
                    c++;
                }
                if(c>n/2){
                    return nums[j];
                }
            }
            
        }return -1;
    }
}// tc -> O(n^2) sc -> O(1)


class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        return nums[n/2];
    }// tc -> O(nlogn) sc -> O(1)
}