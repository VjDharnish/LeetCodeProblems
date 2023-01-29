/*Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.

 

Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
] 
*/
class Solution {
    public void trackTarget(int[] candidates,int target,int i,List<Integer> arr,List<List<Integer>> result){
        // 1 1 2 5 6 7 10
        if(i == candidates.length){
            if(target==0){
            result.add(new ArrayList(arr));
            }
            return;
        }
        if(candidates[i]<=target){
            arr.add(candidates[i]);
            trackTarget(candidates,target-candidates[i],i+1,arr,result);
            arr.remove(arr.size()-1);
        }
        while(i< candidates.length-1 && candidates[i]==candidates[i+1]) i++;
        trackTarget(candidates,target,i+1,arr,result);
        
        
     
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
         Arrays.sort(candidates);
        trackTarget( candidates, target,0,arr,result);
        return result;
    }
}
