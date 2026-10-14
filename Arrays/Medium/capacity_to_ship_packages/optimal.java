class Solution {
    public int Cap(int [] weights,int cap){
        int days=1,load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>cap){
                days+=1;
                load=weights[i];
            }else{
                load+=weights[i];
            }
        }return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int maxi=0;
        int sum=0;
        for(int weight:weights){
            maxi=Math.max(maxi,weight);
            sum+=weight;
        }
        int low=maxi;
        int high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            int dayss=Cap(weights,mid);
            if(dayss<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }return low;
    }
}// tc -> O(n*log(sum-maxi)) sc -> O(1)