class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int k=1;
        int j=1;

        while(j < nums.length){
            if(nums[i] == nums[j]) j++;
            else {
                
                nums[k] = nums[j];
                
                i++;
                k++;
                j++;
            }
        }
        return i+1;
    }
}