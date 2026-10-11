class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int []rows = new int[n];
        int []cols = new int[m];
        for(int i=0;i<m;i++){
            int maxi = matrix[0][i];
            for(int j = 1;j<n;j++){
                if (matrix[j][i]>maxi) maxi = matrix[j][i];
            }
            cols[i] = maxi;
        }
        for(int i=0;i<n;i++){
            int mini = matrix[i][0];
            for(int j=1;j<m;j++){
                if(matrix[i][j]<mini) mini = matrix[i][j];
            }
            rows[i] = mini;
        }
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int x = matrix[i][j];
                if(x>=cols[j] && x<=rows[i]) res.add(x);
            }
        }
        return res;
    }
}