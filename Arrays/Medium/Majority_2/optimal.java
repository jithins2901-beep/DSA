class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int c1=0,c2=0;
        int el1=0,el2=0;
        for(int i=0;i<n;i++){
            if(c1==0 && nums[i]!=el2){
                c1++;
                el1=nums[i];
            }else if(c2==0 && nums[i]!=el1){
                c2++;
                el2=nums[i];
            }
            else if(nums[i]==el1) c1++;
            else if(nums[i]==el2) c2++;
            else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el1) c1++;
            else if(nums[i]==el2) c2++;
        }
        List<Integer> list=new ArrayList<>();
        if(c1>n/3){
            list.add(el1);
        }
        if(c2>n/3){
            list.add(el2);
        }return list;
    }
}// tc -> O(n) sc -> O(1)