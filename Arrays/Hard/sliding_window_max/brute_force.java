class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        int no=0;
        for(int i=0;i<n-k+1;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                max=Math.max(max,nums[j]);
            }
            list.add(max);
        }
        int ans[]=new int[n-k+1];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }return ans;
    }
}// tc -> O(n*k) sc -> O(n-k+1) for list