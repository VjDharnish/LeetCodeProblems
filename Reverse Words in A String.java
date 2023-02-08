// Given an input string s, reverse the order of the words.
// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
// Return a string of the words in reverse order concatenated by a single space.
// Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

class Solution {
    public String reverseWords(String s) {
        s= s.trim();
        int idx = s.indexOf(" "); 
        if(idx==-1)
            return s;
        return reverseWords(s.substring(idx+1,s.length()))+" " + s.substring(0,idx).trim();
    }
}
