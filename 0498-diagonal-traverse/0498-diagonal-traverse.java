class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m*n];
        int c = 0;
        int curr_col =0,curr_row =0;
        boolean dir = true;
        while (c<m*n){
            if(dir){
                while (curr_row>=0 && curr_col<n){
                    res[c++]=mat[curr_row][curr_col];
                    curr_row--;
                    curr_col++;
                }
                if (curr_col>=n){
                    curr_col--;
                    curr_row+=2;
                }
                else{
                    curr_row++;
                }
                dir=false;
            }
            else{
                while(curr_row<m && curr_col>=0){
                    res[c++]=mat[curr_row][curr_col];
                    curr_row++;
                    curr_col--;
                }
                if(curr_row>=m){
                    curr_col+=2;
                    curr_row--;
                }
                else{
                    curr_col++;
                }
                dir=true;
            }
        }
        return res;
    }
}