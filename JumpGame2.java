
public class JumpGame2 {
	public static int jump(int[] nums) { 
        int count =0;
        int left =0,right =0;
        while(right<nums.length-1){
            int maxJump =0;
            for(int i =left;i<=right;i++){
                maxJump = Math.max(maxJump,i+nums[i]);
            }
            left = right+1;
            right = maxJump;
            count++;
        }   
       return count;  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,3,1,1,4};
		System.out.println(jump(nums));

	}

}
