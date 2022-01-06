/*
1437. Check If All 1's Are at Least Length K Places Away
Easy

Given an binary array nums and an integer k, return true if all 1's are at least k places away from each other, otherwise return false.

 

Example 1:


Input: nums = [1,0,0,0,1,0,0,1], k = 2
Output: true
Explanation: Each of the 1s are at least 2 places away from each other.
Example 2:


Input: nums = [1,0,0,1,0,1], k = 2
Output: false
Explanation: The second 1 and third 1 are only one apart from each other.
 

Constraints:

1 <= nums.length <= 105
0 <= k <= nums.length
nums[i] is 0 or 1
*/

class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        
        int t = k;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (t >= k) {
                    t = 0;
                } else {
                    return false;
                }
            } else {
                t++;
            }
        }
        
        return true;
    }
}