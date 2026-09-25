class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(nums[j]==nums[i]){
                    c++;
                }
            }
            if(c>n/3 && !list.contains(nums[i])){
                    list.add(nums[i]);
            }
        }return list;
    }
}// tc -> O(n^2) sc -> O(1)