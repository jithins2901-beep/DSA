class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);// to handle the case when sum-k=0
        int sum=0;
        int count=0;
        for(int i:nums){
            sum+=i;
            if(map.containsKey(sum-k)){// if sum-k is present in the map then we can say that there exists a subarray with sum=k
                count+=map.get(sum-k);// add the frequency of sum-k to count because there can be multiple subarrays with sum=k
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
        
    }
}// tc -> O(n) sc -> O(n)