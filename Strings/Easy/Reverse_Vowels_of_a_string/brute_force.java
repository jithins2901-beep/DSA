class Solution {
    public String reverseVowels(String s)     {
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
                   if("aeiouAEIOU".indexOf(c)!=-1){
                       list.add(c);
                   }

        }
        char ans[]=new char[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }

        int l=0;
        int r=ans.length-1;
        while(l<r){
            char t=ans[l];
            ans[l]=ans[r];
            ans[r]=t;
            l++;
            r--;
        }
        char result[] = s.toCharArray();
        int  vowel=0;
        for(int i=0;i<result.length;i++){
            char c=s.charAt(i);
                   if("aeiouAEIOU".indexOf(c)!=-1){
                     result[i]=ans[vowel];
                       vowel++;
                   }

        }
        return new String(result);
        
    }
}
// tc: O(n) sc: O(n)
