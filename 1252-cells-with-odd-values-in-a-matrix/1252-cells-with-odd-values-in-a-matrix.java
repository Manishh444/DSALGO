class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];
        int count = 0;
        for(int i = 0; i < indices.length; i++){
            for(int j = 0; j <n; j++){
                ans[indices[i][0]][j] +=1;
            }
             for(int j = 0; j <m; j++){
                  ans[j][indices[i][1]] +=1;
            }
        }
       for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(ans[i][j] %2 != 0){
                    count +=1;
                }
            }
             
        }
        
       System.out.print(Arrays.deepToString(ans));
         return count;
    }
}