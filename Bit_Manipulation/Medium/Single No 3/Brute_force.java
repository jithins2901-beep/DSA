class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++) {
            int c=0;
            for(int j=0;j<n;j++){
                if(nums[j]==nums[i]){
                    c++;
                }
            }
            if(c==1) list.add(nums[i]);
        }
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }return ans;
    }
}
// tc: O(n^2) sc: O(n)