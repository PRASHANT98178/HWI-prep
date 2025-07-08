// class Solution {
    // int[][] dp;
    // public int maxVal(int i, int[][] arr, int k, int start, int end){
    //     if(i>= arr.length || k==0) return 0;

    //     if(dp[i][k] != -1) return dp[i][k];

    //     int take = 0;
    //     if(arr[i][0] > end){
    //         take = arr[i][2] + maxVal(i+1, arr, k-1, Math.min(start, arr[i][0]), Math.max(end, arr[i][1]));
    //     }
    //     int nottake = maxVal(i+1, arr, k, start, end);
    //     return Math.max(take, nottake);
    // }


    // public int maxValue(int[][] events, int k) {
        // Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        
        // dp = new int[events.length][k + 1];
        // for (int[] row : dp) {
        //     Arrays.fill(row, -1);
        // }

        // return maxVal(0, events, k, Integer.MAX_VALUE, Integer.MIN_VALUE);
        // 

//     }
// }


class Solution {
    int[][] dp;

    public int maxValue(int[][] events, int k) {
        int n = events.length;
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));

        dp = new int[n][k + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        return helper(0, events, k);
    }

    public int helper(int i, int[][] events, int k) {
        if (i >= events.length || k == 0) return 0;
        if (dp[i][k] != -1) return dp[i][k];

        // Option 1: skip current
        int notTake = helper(i + 1, events, k);

        // Option 2: take current
        int next = findNext(events, i);
        int take = events[i][2] + helper(next, events, k - 1);

        return dp[i][k] = Math.max(take, notTake);
    }

    // Binary search to find next event that starts after events[i][1]
    private int findNext(int[][] events, int i) {
        int left = i + 1, right = events.length - 1;
        int target = events[i][1];
        int ans = events.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (events[mid][0] > target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
