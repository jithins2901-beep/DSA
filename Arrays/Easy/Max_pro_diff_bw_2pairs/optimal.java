class Solution {
    public int maxProductDifference(int[] nums) {
        int n=nums.length;
        int ll=Math.min(nums[0],nums[1]);
        int lh=Math.max(nums[0],nums[1]);
        int hl=Math.min(nums[0],nums[1]);
        int hh=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            if(nums[i]<ll){
                lh=ll;
                ll=nums[i];
            }else if(nums[i]<lh){
                lh=nums[i];
            }
            if(nums[i]>hh){
                hl=hh;
                hh=nums[i];
            }else if(nums[i]>hl){
                hl=nums[i];
            }
        }return (hh*hl)-(ll*lh);
    }
}// tc -> O(n) sc -> O(1)