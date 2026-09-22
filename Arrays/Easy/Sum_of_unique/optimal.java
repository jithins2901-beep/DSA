class Solution {
    public int sumOfUnique(int[] nums) {
        int n=nums.length;
        int freq[]=new int[101];
        for(int num:nums){
            freq[num]++;
        }
        int sum=0;
        for(int num:nums){
            if(freq[num]==1){
                sum+=num;
            }
        }return sum;
    }
}// tc -> O(n) sc -> O(1)