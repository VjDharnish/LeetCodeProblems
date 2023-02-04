// Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
// In other words, return true if one of s1's permutations is the substring of s2.

import java.util.Arrays;
public class PermutationInString {
	public static boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
            return false;
        if(s1.length() ==0)
            return true;
       int[] map1 = new int[26];
       int[] map2 = new int[26];
       int size  = s1.length();
       for(int k =0;k<size;k++){
           map1[s1.charAt(k)-'a']++;
           map2[s2.charAt(k)-'a']++;
        }
         if(Arrays.equals(map1,map2))
                return true;
        for(int i=size;i<s2.length();i++){ 
            
            map2[s2.charAt(i-size)-'a']--;
            map2[s2.charAt(i)-'a']++; 
            if(Arrays.equals(map1,map2))
                return true;
        }
         
    return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="ab";
		String s2 ="eaidbaooo";
		System.out.println(checkInclusion(s1,s2));

	}

}
