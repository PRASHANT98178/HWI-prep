class Solution {
    public void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i] == i || nums[i] == nums.length) i++;
            else{
                swap(i, nums[i], nums);
            }
        }

        int j = -1;

        for(int k=0; k<nums.length; k++){
            if(k != nums[k]){
                j = k;
                break;
            }
        }
        if(j == -1) return nums.length;
        return j;
    }
}