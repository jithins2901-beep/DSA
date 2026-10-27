class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        for(int mask=0;mask<(1<<n);mask++){
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                if((mask & (1<<i)) !=0 ){
                    list.add(nums[i]);
                } 
            }ans.add(list);
        }return ans;
    }
}// tc: O(n*2^n) sc: O(1)
// O(n*2^n) because we are generating all the subsets and for each subset we are iterating through the elements of the array to check if the element is present in the subset or not.

