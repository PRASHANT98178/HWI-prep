class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            set.add(nums[i]);
        }
        int maxlen = 0;
        for(int ele : set){
            if(!set.contains(ele-1)){
                int currele = ele;
                int count = 1;

                while(set.contains(currele+1)){
                    currele++;
                    count++;
                }

                maxlen = Math.max(maxlen, count);
            }
        }
        return maxlen;
    }
}