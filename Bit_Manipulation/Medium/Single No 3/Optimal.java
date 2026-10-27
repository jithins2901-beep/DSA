class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        int r=0;
        for(int i=0;i<n;i++){
            r=r^nums[i];
        }
        int rmd=r & -r;
        int n1=0;
        int n2=0;
        for(int i=0;i<n;i++){
            if((nums[i] & rmd) == 0){
                n1=n1^nums[i];
            }
            else{
                n2=n2^nums[i];
            }
        }
        return new int[]{n1,n2};
    }
}
// tc: O(n) sc: O(1)