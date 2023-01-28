/*Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

Note that the same word in the dictionary may be reused multiple times in the segmentation.

 

Example 1:

Input: s = "leetcode", wordDict = ["leet","code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".
Example 2:

Input: s = "applepenapple", wordDict = ["apple","pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
Note that you are allowed to reuse a dictionary word.
Example 3:

Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: false
*/

class Solution {
    public boolean wordBreak(String s,List<String> wordDict){
         boolean[] dp = new boolean[s.length()];
         Arrays.fill(dp,true);
         boolean res =  breakWord(s, wordDict,dp,0);
        return res;
    }
  
    public boolean breakWord(String s, List<String> wordDict,boolean[] dp,int i) {
        
       
        boolean flag=false;
        if(s.length() == i){
            return true;
        }
        
        for(String word:wordDict){
                if(word.length()>s.length()){
                    continue;
                }
                int wordLength = word.length();
            
                
                if(wordLength+i <= s.length() && dp[i] && word.equals(s.substring(i,wordLength+i))){
                
                // System.out.println(word.equals(s.substring(i,wordLength+i)));
                flag = breakWord(s,wordDict,dp,i+wordLength); 
                        if(flag){
                        return true;

                         } else{
                             dp[i+wordLength]=false;
                         }

            
                // else
                //  return false;
                
            }
        }
        
        return false;
    }
}
