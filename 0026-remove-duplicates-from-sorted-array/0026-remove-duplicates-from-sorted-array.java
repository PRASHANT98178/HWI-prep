class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        int k=1;

        while(j < nums.length){
            if(nums[i] == nums[j]) j++;
            else{
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;

                i++;
                j++;
                k++;
            }
        }
        return i+1;
    }
}