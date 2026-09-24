class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> map=new HashSet<>();
        for(int i:nums){
            map.add(i);
        }
        int longest=0;
        for(int num:map){
            if(!map.contains(num-1)){
                int cur=num;
                int c=1;
                while(map.contains(cur+1)){
                    cur++;
                    c++;
                }
                longest=Math.max(longest,c);
            }
            
        }
        return longest;
    }
}// tc -> O(n) sc -> O(n)