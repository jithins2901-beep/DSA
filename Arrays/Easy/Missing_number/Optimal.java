class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int s2=0;
        for(int i=0;i<n;i++){
            s2+=nums[i];
        }
        return sum-s2;
    }
}// tc -> O(n) sc -> O(1)

class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int x1=0,x2=0;
        for(int i=0;i<n;i++){
            x1=x1^nums[i];
            x2=x2^(i+1);
        }return x1^x2;
    }
}//