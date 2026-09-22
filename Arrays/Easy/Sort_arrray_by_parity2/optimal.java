class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=1;
        while(i<n && j<n){
            if(nums[i]%2==0){
                i+=2;
            }else if(nums[j]%2!=0){
                j+=2;
            }else{
                int t=nums[j];
                nums[j]=nums[i];
                nums[i]=t;
                i+=2;
                j+=2;
            }
        }return nums;
    }
}// tc -> O(n) sc -> O(1)