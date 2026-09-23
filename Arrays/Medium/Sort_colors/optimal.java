class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                mid++;
                low++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
    public void swap(int nums[],int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}// tc -> O(n) sc -> O(1)

class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int c=0,c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                c++;
            }else if(nums[i]==1){
                c1++;
            }else{
                c2++;
            }
        }
        int i=0;
        while(c>0){
            nums[i]=0;
            i++;
            c--;
        }
        while(c1>0){
            nums[i]=1;
            i++;
            c1--;
        }
        while(c2>0){
            nums[i]=2;
            i++;
            c2--;
        }
    }
    
}// tc -> O(n) sc -> O(1)