// Given a string of lowercase alphabets, count all possible substrings (not necessarily distinct) that have exactly k distinct characters. 
package GeeksForGeeks;

public class CountNoOfSubstring {
	static long substrCount (String S, int K) {
        int result =0;      
        for(int i =0;i<S.length();i++){
            int[] arr = new int[26];
            int uniqueChar =0;
            for(int j =i;j<S.length();j++){
                if(arr[S.charAt(j)-'a'] == 0)
                    uniqueChar++;
                arr[S.charAt(j)-'a']++;
                if(uniqueChar == K)
                    result++;
                if(uniqueChar>K)
                    break;
            }
        }
        return result;
    }
	public static void main(String[] args) {
		String S = "abaaca";
		int k =1;
		System.out.println(substrCount(S,k));

	}

}
