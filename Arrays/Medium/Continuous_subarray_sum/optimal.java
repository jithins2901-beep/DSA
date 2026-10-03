class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        int prefixsum=0;
        int remainder=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            prefixsum+=nums[i];
            remainder=prefixsum%k;
            if(map.containsKey(remainder)){
                int oldindex=map.get(remainder);
                if(i-oldindex>=2){
                    return true;
                }
            }else{
                map.put(remainder,i);
            }

        }return false;
        
    }
}// tc -> O(n) sc -> O(n)