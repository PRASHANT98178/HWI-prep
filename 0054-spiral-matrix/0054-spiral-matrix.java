class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int minrow = 0;
        int maxrow = matrix.length-1;
        int mincol = 0;
        int maxcol = matrix[0].length-1;

        while(minrow <= maxrow && mincol <= maxcol){
            for(int j=mincol; j<=maxcol; j++){
                ans.add(matrix[minrow][j]);
            }
            minrow++;

            if(minrow > maxrow || mincol > maxcol) break;
            for(int i=minrow; i<=maxrow; i++){
                ans.add(matrix[i][maxcol]);
            }
            maxcol--;

            if(minrow > maxrow || mincol > maxcol) break;
            for(int j=maxcol; j>=mincol; j--){
                ans.add(matrix[maxrow][j]);
            }
            maxrow--;

            if(minrow > maxrow || mincol > maxcol) break;
            for(int i=maxrow; i>=minrow; i--){
                ans.add(matrix[i][mincol]);
            }
            mincol++;
        }
        return ans;
    }
}