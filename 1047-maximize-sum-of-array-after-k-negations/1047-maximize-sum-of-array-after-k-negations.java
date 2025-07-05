class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0; i<n && k>0; i++){
            if(nums[i]<0 ){
                nums[i] = -nums[i];
                k--;
            }
            else if(nums[i]==0){
                break;
            }
            
        }
        Arrays.sort(nums);
        for(int i=0; i<n && k>0; i++){
            if(nums[i] == 0){
                break;
            }
            else if(k%2 == 0) break;
            else if(k%2 != 0){
                nums[i] = -nums[i];
                break;
            }
        }

        int sum = 0;
        for(int ele : nums){
            sum += ele;
        }
        return sum;
    }
}