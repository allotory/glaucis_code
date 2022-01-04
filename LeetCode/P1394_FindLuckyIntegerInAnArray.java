/*
1394. Find Lucky Integer in an Array
Easy

Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.

Return the largest lucky integer in the array. If there is no lucky integer return -1.

 

Example 1:

Input: arr = [2,2,3,4]
Output: 2
Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
Example 2:

Input: arr = [1,2,2,3,3,3]
Output: 3
Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
Example 3:

Input: arr = [2,2,2,3,3]
Output: -1
Explanation: There are no lucky numbers in the array.
 

Constraints:

1 <= arr.length <= 500
1 <= arr[i] <= 500
*/

class Solution {
    /*
    public int findLucky(int[] arr) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        int max = 0;
        for (Map.Entry<Integer, Integer> e: map.entrySet()) {
            if (e.getKey() == e.getValue()) {
                max = Math.max(max, e.getKey());
            }
        }
        
        if (max != 0) {
            return max;
        }
        
        return -1;
    }
    */
    
    public int findLucky(int[] arr) {
        int[] a = new int[501];
        
        for (int i = 0; i < arr.length; i++) {
            a[arr[i]]++;
        }
        
        for (int i = a.length - 1; i > 0; i--) {
            if (a[i] == i) {
                return i;
            }
        }
        
        return -1;
    }
}