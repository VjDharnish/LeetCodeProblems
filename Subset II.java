// Does not contain duplicate subsets

class Solution {
    public void set(List<Integer> arr,int[] nums,int start,List<List<Integer>> result){
        if(start == nums.length){
            result.add(new ArrayList(arr));
            return;
        }
        arr.add(nums[start]);
        set(arr,nums,start+1,result);
        arr.remove(arr.size()-1);
         while(start<nums.length-1 && nums[start]==nums[start+1])start++;
        set(arr,nums,start+1,result);
      
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> arr = new ArrayList<>();
    Arrays.sort(nums);
    set(arr,nums,0,result);   
    return result;
        
    }
}
