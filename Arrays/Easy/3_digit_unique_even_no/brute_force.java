class Solution{
    public int totalNumbers(int[] digits){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i==j || i==k || j==k){
                        continue;
                    }

                    if(digits[i]==0) continue;

                    int num=digits[i]*100+digits[j]*10+digits[k];
                    if(num%2==0){
                        set.add(num);
                    }
                }
            }
        }return set.size;
    }// tc -> O(n^3) sc -> O(n)
}