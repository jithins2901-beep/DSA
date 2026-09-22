class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        Set<Integer> map=new HashSet<>();
        for(int na:nums){
            if(map.contains(na)){
                return true;
            }
            map.add(na);
        }
        return false;
    }
}// tc -> O(n) sc -> O(n)