/*
1576. Replace All ?'s to Avoid Consecutive Repeating Characters
Easy

Given a string s containing only lowercase English letters and the '?' character, convert all the '?' characters into lowercase letters such that the final string does not contain any consecutive repeating characters. You cannot modify the non '?' characters.

It is guaranteed that there are no consecutive repeating characters in the given string except for '?'.

Return the final string after all the conversions (possibly zero) have been made. If there is more than one solution, return any of them. It can be shown that an answer is always possible with the given constraints.

 

Example 1:

Input: s = "?zs"
Output: "azs"
Explanation: There are 25 solutions for this problem. From "azs" to "yzs", all are valid. Only "z" is an invalid modification as the string will consist of consecutive repeating characters in "zzs".
Example 2:

Input: s = "ubv?w"
Output: "ubvaw"
Explanation: There are 24 solutions for this problem. Only "v" and "w" are invalid modifications as the strings will consist of consecutive repeating characters in "ubvvw" and "ubvww".
 

Constraints:

1 <= s.length <= 100
s consist of lowercase English letters and '?'.
*/

class Solution {
    public String modifyString(String s) {
        int t = 97;
        int i = 0;
        char[] cs = s.toCharArray();
        
        while (i < cs.length) {
            if (cs[i] == '?') {
                
                char c = (char) t;
                char c1 = i > 0? cs[i - 1]: '0';
                char c2 = i < cs.length - 1? cs[i + 1]: '0';
                
                if (c1 != c && c != c2) {
                    cs[i] = c;
                    i++;
                    t = 97;
                } else {
                    t++;
                } 
            } else {
                i++;
            }
        }
        return new String(cs);
    }
}