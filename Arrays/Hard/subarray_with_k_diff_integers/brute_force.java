public class brute_force {
    
    public static int subarrayWithKDiff(int arr[], int k){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<n;j++){
                set.add(arr[j]);
                if(set.size()==k){
                    count++;
                }else if(set.size()>k){
                    break;
                }
            }
        }return count;
    }
}// tc -> O(n^2) sc -> O(k) for set