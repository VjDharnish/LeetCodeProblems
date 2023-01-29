/*
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
frequency
 of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
*/
class Solution {
    public void trackTarget(int[] candidates,int target,int i,List<Integer> arr,List<List<Integer>> result){
        if(i==candidates.length){
        if(target ==0){
            result.add(new ArrayList(arr));}
            return;
        
        }
        
        
        if(candidates[i]<=target){
        arr.add(candidates[i]);
        trackTarget(candidates,target-candidates[i],i,arr,result);
        arr.remove(arr.size()-1); 
        }
        trackTarget(candidates,target,i+1,arr,result);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        trackTarget( candidates, target,0,arr,result);
        return result;
    }
}
