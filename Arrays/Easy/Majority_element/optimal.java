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
//Algorithm called Boyer-Moore Voting Algorithm is used here to find the majority element in an array. The algorithm works by maintaining a count of the current candidate for the majority element. If the count reaches zero, a new candidate is chosen. If the current element matches the candidate, the count is incremented; otherwise, it is decremented. At the end of the iteration, the candidate will be the majority element if one exists.