class Solution {
    public int startSearch(int[] nums,int left,int right,int target){
        int idx =-1;
        while(left<=right){
            int mid=left + (right-left)/2;
            if(nums[mid]>=target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
            if(nums[mid] == target){
                    idx = mid;
                }
            }
        
        return idx;
    }
     public int endSearch(int[] nums,int left,int right,int target){
         int idx=-1;
        while(left<=right){
            int mid=left + (right-left)/2;
            if(nums[mid]<=target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
            if(nums[mid] == target){
                    idx = mid;
                }
            }
        
        return idx;
    }

    
    public int[] searchRange(int[] nums, int target) {
        int left= 0;
        int right = nums.length-1;
        int[] res = new int[2];
        res[0] = startSearch(nums,left,right,target);
        res[1] = endSearch(nums,left,right,target);
        return res; 

       }
}
