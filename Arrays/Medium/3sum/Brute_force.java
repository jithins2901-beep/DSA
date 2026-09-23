class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> ans=Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(ans);//sort the triplet to avoid duplicates
                        if(!list.contains(ans)){
                            list.add(ans);
                        }
                    }
                }
            }
        }return list;
    }
}//tc -> O(n^3) sc -> O(1)
/*if(!list.contains(Arrays.asList(nums[i],nums[j],nums[k]))){
    list.add(Arrays.asList(nums[i],nums[j],nums[k]));
}*/