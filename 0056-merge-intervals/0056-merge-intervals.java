class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int n = intervals.length;
        int last = intervals[0][1];

        ArrayList<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);

        for(int i=1; i<n; i++){
            if(intervals[i][0] <= last){
                last = Math.max(last, intervals[i][1]);
                ans.get(ans.size()-1)[1] =  last;
            }
            else {
                ans.add(intervals[i]);
                last = intervals[i][1];
            }
        }
        int[][] res = new int[ans.size()][2];
        for(int i=0; i<ans.size(); i++){
            res[i][0] = ans.get(i)[0];
            res[i][1] = ans.get(i)[1];
        }
        return res;
    }
}