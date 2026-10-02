class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        quicksort(nums,0,n-1);
        return nums;
    }
    public void quicksort(int nums[],int low,int high){
        if(low<high){
            int pv=partition(nums,low,high);
            quicksort(nums,low,pv-1);
            quicksort(nums,pv+1,high);
        }
    }
    public int partition(int nums[],int low,int high){
        int p=nums[low];
        int i=low;
        int j=high;
        while(i<j){
            while(nums[i]<=p && i<=high-1){
                i++;
            }
            while(nums[j]>=p && j>=low+1){
                j--;
            }
            if(i<j){
                int t=nums[j];
                nums[j]=nums[i];
                nums[i]=t;
            }
        }
        int t1=nums[j];
        nums[j]=nums[low];
        nums[low]=t1;
        return j;
    }
}// tc -> O(nlogn) sc -> O(logn)