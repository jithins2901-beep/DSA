class Solution {
    public String reverseVowels(String s) {
        char[] ans=s.toCharArray();
        int l=0;
        int r=ans.length-1;
        while(l<r){
            while(l<r && "aeiouAEIOU".indexOf(ans[l])==-1){
                l++;
            }
            while(l<r && "aeiouAEIOU".indexOf(ans[r])==-1){
                r--;
            }
            char t=ans[l];
            ans[l]=ans[r];
            ans[r]=t;
            l++;
            r--;
        }return new String(ans);
    }
}
// tc: O(n) sc: O(1)