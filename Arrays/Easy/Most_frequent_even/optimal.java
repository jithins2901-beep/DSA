class Solution{
    public int mostFrequentEven(int[] nums){
        int n=nums.length;
        int freq[]=new int[100001];
        for(int num:nums){
            if(num%2==0){
                freq[num]++;
            }
        }
        int max=0;
        int ans=-1;
        for(int num:nums){
            if(num%2==0 && (freq[num]>max || (freq[num]==max)&&num<ans)){
                max=freq[num];
                ans=num;
            }
        }return ans;
    }// tc -> O(n) sc -> O(1)
}