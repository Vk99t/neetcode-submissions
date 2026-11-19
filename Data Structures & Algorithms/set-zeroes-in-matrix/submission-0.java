class Solution {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> tracker=new ArrayList<>();
        int rows=matrix.length;
        int columns=matrix[0].length;
        for(int row=0;row<rows;row++){
            for(int col=0;col<columns;col++){
                if(matrix[row][col]==0){
                  tracker.add(List.of(row,col));
                }
            }
        }
        for(List<Integer> list:tracker){
           updateRowToZero(matrix,list.get(0));
           updateColumnToZero(matrix,list.get(1));
        }
        
    }

    public void updateRowToZero(int[][] matrix,int row){
      int i=0;
      while(i<matrix[0].length){ // column length
        matrix[row][i]=0;
        i++;
      }
    }

    public void updateColumnToZero(int[][] matrix,int column){
      int i=0;
      while(i<matrix.length){ // rows
        matrix[i][column]=0;
        i++;
      }
    }

}
