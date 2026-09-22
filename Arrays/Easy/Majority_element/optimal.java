class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int na:nums){
            map.put(na,map.getOrDefault(na,0)+1);
            if(map.get(na)>nums.length/2){
                return na;
            }
        }
        return -1;
    }
}// tc -> O(n) sc -> O(n)

class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int c=0;
        int el=0;
        for(int i=0;i<n;i++){
            if(c==0){
                c=1;
                el=nums[i];
            }else if(nums[i]==el){
                c++;
            }else{
                c--;
            }
        }return el;
    }
}// tc -> O(n) sc -> O(1)