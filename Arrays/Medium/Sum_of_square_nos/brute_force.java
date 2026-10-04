class Solution {
    public boolean judgeSquareSum(int c) {
        if(c==0){
            return true;
        }
        for(int i=1;i<=c;i++){
            for(int j=1;j<=c;j++){
                if((i*i+j*j)==c || i*i==c || j*j==c){
                    return true;
                }            
            }
        }return false;
    }
}// tc -> O(c^2) sc -> O(1)