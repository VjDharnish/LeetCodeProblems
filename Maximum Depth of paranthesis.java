// Input: s = "(1+(2*3)+((8)/4))+1"
// Output: 3
// Explanation: Digit 8 is inside of 3 nested parentheses in the string.

class Solution {
    public int maxDepth(String s) {
        int count = 0,max =0;
        for(int i =0 ;i<s.length();i++){
            char c= s.charAt(i);
            max = Math.max(count,max);
            if(c=='(') count++;
            else if(c ==')') count--;
        }
        return max;
    }
}
