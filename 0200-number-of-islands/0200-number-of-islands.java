class Solution {
    public int numIslands(char[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        
        int numIslands = 0;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]=='1'){
                    numIslands++;
                    dfs(grid, i, j);
                }
            }
        }
        
        return numIslands;
    }
    
    void dfs(char grid[][], int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0' || grid[i][j]=='2')
            return;
        
        grid[i][j] = '2';
        
         dfs(grid, i+1, j);
         dfs(grid, i-1, j);
         dfs(grid, i, j+1);
         dfs(grid, i, j-1);
    }
}