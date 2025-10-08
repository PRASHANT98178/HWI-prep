class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ele = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            if(count == 0){
                ele = nums[i];
                count++;
            }
            else if(nums[i] == ele){
                count++;
            }
            else count--;
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == ele) ans++;
        }
        if(ans > n/2) return ele;
        return -1;
    }
}