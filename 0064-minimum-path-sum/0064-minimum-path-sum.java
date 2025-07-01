class Solution {
    public int path(int i, int j, int[][] grid,  int[][] dp){
        if(i == grid.length-1 && j == grid[0].length-1) return dp[i][j] = grid[i][j];
        if(i >= grid.length || j >= grid[0].length) return Integer.MAX_VALUE;

        if(dp[i][j] != -1) return dp[i][j];
        int down = path(i+1, j, grid, dp);
        int right = path(i, j+1, grid, dp);
        return dp[i][j] = grid[i][j] + Math.min(down, right);
       
    }
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return path(0, 0, grid, dp);
    }
}