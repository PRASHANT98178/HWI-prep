class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));
        int n = intervals.length;
        int end = Integer.MIN_VALUE;
        int count = 0;

        for(int i=0; i<n; i++){
            if(intervals[i][0] >= end){
                end =  intervals[i][1];
            }
            else {
               count++;
            }
        }
        return count;
    }
}