class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int k=1;
        int j=0;

        while(j < nums.length){
            if(nums[i] == nums[j]) j++;
            else {
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                i++;
                k++;
                j++;
            }
        }
        return i+1;
    }
}