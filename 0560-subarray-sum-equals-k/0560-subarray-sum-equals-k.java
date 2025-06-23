class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;

        for(int i=0; i<n; i++){
            sum += nums[i];
            int remining = sum - k;
            if(map.containsKey(remining)){
                count += map.get(remining);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}