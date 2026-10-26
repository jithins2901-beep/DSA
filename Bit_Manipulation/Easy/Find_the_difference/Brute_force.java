class Solution {
    public char findTheDifference(String s, String t) {
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        for(char cs:s.toCharArray()){
            freq1[cs-'a']++;
        }
        for(char ct:t.toCharArray()){
            freq2[ct-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                return (char)(i+'a');
            }
        }return ' ';
    }
}
// tc: O(n) sc: O(1)


class Solution {
    public char findTheDifference(String s, String t) {
        char c=0;
        for(char cs:s.toCharArray()) c^=cs;
        for(char ct:t.toCharArray()) c^=ct;
        return c;
    }
}
// tc: O(n) sc: O(1)