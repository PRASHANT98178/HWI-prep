class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n==1) return 1;
        int i = 0;
        int j = 1;
        int k = 1;

        while(j<nums.length){
            if(nums[i] == nums[j]) j++;
            else{
                nums[k] = nums[j];;
                j++;
                k++;
                i++;
            }
        }
        return i+1;
    }
}