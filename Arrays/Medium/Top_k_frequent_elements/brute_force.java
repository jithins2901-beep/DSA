class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());  //
        list.sort((a,b)->b.getValue()-a.getValue());  //b-a so 4321 will be in descending if it is a-b 1234
        for(int i=0;i<k;i++){
            ans[i]=list.get(i).getKey();  //adding only key not frequency (2,3) 2 will be added
        }return ans;
    }
}// tc -> O(nlogn) sc -> O(n)
//In map we are storing frequencies and sorting based on values