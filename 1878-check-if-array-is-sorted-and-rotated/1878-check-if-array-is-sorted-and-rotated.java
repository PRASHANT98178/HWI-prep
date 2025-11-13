class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        if(n==1) return true;

        int idx = -1;
        for(int i=0; i<n-1; i++){
            if(nums[i] > nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1) return true;

        for(int i=0; i<idx; i++){
            if(nums[i] > nums[i+1]) return false;
        }

        if(nums[0] < nums[n-1]) return false;

        for(int i=idx+1; i<n-1; i++){
            if(nums[i] > nums[i+1]) return false;
        }

        return true;
    }
}