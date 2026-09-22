class Solution {
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        int freq[]=new int[10];
        for(int i=0;i<n;i++){
            freq[digits[i]]++;
        }
        int c=0;
        for(int hundreds=1;hundreds<=9;hundreds++){
            if(freq[hundreds]==0) continue;
            freq[hundreds]--;
            for(int tens=0;tens<=9;tens++){
                if(freq[tens]==0) continue;
                freq[tens]--;
                for(int units=0;units<=8;units+=2){
                    if(freq[units]>0) {
                        c++;
                    }
                }freq[tens]++;
            }freq[hundreds]++;
        }return c;
    }
}// tc -> O(n) sc -> O(1)