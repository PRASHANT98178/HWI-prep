class Solution {
    
    public boolean isValid(int i, Set<Integer> set, int k){
        for(int j : set){
            if(Math.abs(i-j) <= k) return true;
        }
        return false;
    }
    
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(nums[i] == key) set.add(i);
        }

        for(int i=0; i<n; i++){

            if(isValid(i, set, k)){
                ans.add(i);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}