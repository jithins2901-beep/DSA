import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int maxlen=0;
        for(int i=0;i<n;i++){
            int cur=nums[i];
            int c=1;
            while(contains(nums,cur+1)){
                cur++;
                c++;
            }
            maxlen=Math.max(maxlen,c);
        }return maxlen;
    }
    public boolean contains(int nums[],int target){
        for(int num:nums){
            if(num==target){
                return true;
            }
        }return false;
    }
}// tc -> O(n^2) sc -> O(1)