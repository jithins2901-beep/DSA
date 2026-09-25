class Solution {
    public int maxProductDifference(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int ll=nums[0];
        int lh=nums[1];
        int hl=nums[n-2];
        int hh=nums[n-1];
        return (hh*hl)-(ll*lh);
    }
}// tc -> O(nlogn) sc -> O(1)