class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[0], b[0]));
        int n = points.length;
        int last = points[0][1];
        int arrow = n;

        for(int i=1; i<n; i++){
            if(last >= points[i][0]){
                arrow--;
                last = Math.min(last, points[i][1]);
            }
            else {
                last = points[i][1];
            }
        }
        return arrow;
    }
}