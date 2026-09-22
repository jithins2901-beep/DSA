class Solution{
    public int[] limitOccurrences(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<i;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count<k){
                ans[index]=nums[i];
                index++;
            }
        }
        return Arrays.copyOf(ans,index);
        // tc -> O(n^2) sc -> O(n)

        /*
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            int freq = map.getOrDefault(nums[i], 0);
            if(freq < k){
                list.add(nums[i]);
                map.put(nums[i], freq+1);
            }
        }

        int[] ans = new int[list.size()];
        for(int i=0; i<ans.length; i++){
            ans[i] = list.get(i);
        }

        return ans;
         */
        // tc -> O(n) sc -> O(n)
    }
}