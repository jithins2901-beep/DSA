class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        List<List<Integer>> list1=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                for(int k=j+1;k<n-1;k++){
                    for(int l=k+1;l<n;l++){
                        if(nums[i]+nums[j]+nums[k]+nums[l]==target){
                            List<Integer> list=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                            if(!list1.contains(list)){
                                list1.add(list);
                            }
                        }
                    }
                }
            }
        }return list1;
    }
}//tc -> O(n^4) sc -> O(1)