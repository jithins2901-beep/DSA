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
        for(int i=maxi;i<=sum;i++){
            int daysreq=Cap(weights,i);
            if(daysreq<=days){
                return i;
            }
        }return -1;
    }
}// tc -> O(n*(sum-maxi)) sc -> O(1)