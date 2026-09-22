class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int n=nums.length;
        int x=0;
        int temp[]=new int[51];
        for(int num:nums){
            temp[num]++;
            if(temp[num]==2){
                x=x^num;
            }
        }return x;
        
    }
}// tc -> O(n) sc -> O(1)