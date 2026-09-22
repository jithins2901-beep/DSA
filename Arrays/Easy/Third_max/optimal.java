class Solution {
        public int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer n : nums) {
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;
    }
}// tc -> O(n) sc -> O(1)
/*
Integer is a wrapper class for the primitive int.

int → can store numbers only
Integer → can store numbers and null
 */
// here Integer is used instead of int mainly because we need null
//if we use int max1=Integer.MIN_VALUE
// for eg num=[-2147483648, -5, -10] so here number itself could be thwe min value
// so we need to say not intitialized so we can use null to check if it is initialized or not

//here long max1=Long.MIN_VALUE is used instead of int max1=Integer.MIN_VALUE
//because Integer.MIN_VALUE = -2147483648 and Long.MIN_VALUE = -9223372036854775808 which is much far and smaller than every possible int

class Solution {
    public int thirdMax(int[] nums) {

        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for (int n : nums) {

            if (n == max1 || n == max2 || n == max3) {
                continue;
            }

            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            }
            else if (n > max2) {
                max3 = max2;
                max2 = n;
            }
            else if (n > max3) {
                max3 = n;
            }
        }

        return max3 == Long.MIN_VALUE ? (int) max1 : (int) max3;
    }
}// tc -> O(n) sc -> O(1)