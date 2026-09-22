class Solution{
    public int duplicateNumbersXOR(int[] nums){
        Map<Integer,Integer> map=new HashMap<>();
        int result=0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)==2){
                result^=num;
            }   
        }
        return result;

        /*
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int element : nums) {
            hashMap.put(element, hashMap.getOrDefault(element,0) + 1);
        }
        int result = 0;
        for(Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
            int key = map.getKey();
            int val = map.getValue();

            if(val == 2) {
                result ^= key;
            }
        }

        return result;
         */
    }// tc -> O(n) sc -> O(n)
}