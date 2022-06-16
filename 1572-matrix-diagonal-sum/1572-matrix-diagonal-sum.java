class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        //this loop is for travelling row
        for (int i=0; i<n; i++){
            sum = sum + mat[i][i] + mat[i][n-1-i];
             // sum = mat[i][2-i];
        }
        System.out.println(sum);
        if(n%2 !=0){
            sum = sum - mat[n/2][n/2];
        }
        else{
            return sum;
        }
        return sum;
    }
}
// class Solution {
//     public int diagonalSum(int[][] mat) {
//         int sum = 0;
//         int n = mat.length;
//         for( int i =0; i<n; i++){
//             sum += mat[i][i] + mat[i][n-1-i];
//         }
//         if(n % 2 !=0){
//             sum -= mat[n/2][n/2];
//         }
//         else{
//             return sum;
//         }
//         return sum;
//     }
// }