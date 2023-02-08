class Solution {
    public int romanToInt(String s) {
        int res =0;
        int ans =0;
       for(int i=s.length()-1;i>=0;i--){
           char ch = s.charAt(i);
           switch(ch){
               case 'I': res = 1;break;
               case 'V': res = 5;break;
               case 'X': res = 10;break;
               case 'L': res = 50;break;
               case 'C': res = 100;break;
               case 'D': res = 500;break;
               case 'M': res = 1000;break;
           }
           if(4*res< ans) ans-=res;
           else ans+=res;
       }
        return ans;
    }
}
