class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int i=0;
        while(i<n && nums[i] < 0 && k>0){
            nums[i]  *= -1;
            k--;
            i++;
        }
        if(k%2 == 1){
            Arrays.sort(nums);
            nums[0] *= -1;
        }

        int sum = 0;
        for(int ele : nums){
            sum += ele;
        }
        return sum;
    }
}