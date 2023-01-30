/*Your task is to calculate ab mod 1337 where a is a positive integer and b is an extremely large positive integer given in the form of an array.
  Example 2:

Input: a = 2, b = [1,0]
Output: 1024 */

class Solution {
    public int power(int a, int b){
         a%=1337;
        int power =1;
        for(int i=0;i<b;i++){
            power*=a;
            power%=1337;
        }
        return power;
    }
  
    public int superPow(int a, int[] b) {
      
       if(b.length==1){
           return (int)Math.pow(a,b[0])%1337;
       }
       int power=0,res=1,temp=0;
        for(int i=0;i<b.length;i++){
          temp=power(a,b[i]);
          temp*=res;
          temp%=1337;
          power = temp;
          temp=power(temp,10);
          res=temp;
        }
    
        return power;
    }
}
