class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        boolean contains[]=new boolean[101];

        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;

        ArrayList<Integer> list=new ArrayList<>();
        for(int num:nums){
            mini=Math.min(mini,num);
            maxi=Math.max(maxi,num);
            contains[num]=true;
        }

        for(int i=mini;i<=maxi;i++){
            if(!contains[i]){
                list.add(i);
            }
        }return list;

    
    }
}// tc -> O(n) sc -> O(1)