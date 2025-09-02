class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = {-1, -1};

        for(int i=0; i<n; i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                ans[0] = i;
                ans[1] = map.get(rem);
                break;
            }else{
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}