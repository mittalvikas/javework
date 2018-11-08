package com.mittalvk.learning;

public class ConnectedCell {

	// Complete the connectedCell function below.
    static int connectedCell(int[][] matrix) {
        
        int max=0;
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            max=Math.max(max,countRegion(matrix,i,j));
        }
    
    }
    return max;
    }
    private static int countRegion(int[][] matrix,int row,int col){
    if (row < 0 || col < 0 || row >= matrix.length || col >= matrix[0].length) return 0;
    if(matrix[row][col]==0)return 0;
        int count=matrix[row][col]--;
        count+= countRegion(matrix,row+1,col);
        count+= countRegion(matrix,row-1,col);
        count+= countRegion(matrix,row,col+1);
        count+= countRegion(matrix,row,col-1);
        count+= countRegion(matrix,row+1,col+1);
        count+= countRegion(matrix,row-1,col-1);
        count+= countRegion(matrix,row-1,col+1);
        count+= countRegion(matrix,row+1,col-1);
        return count;
    }
    
    
    public static void main(String[] args) {
		int[][] arr= {
				{0, 0, 1, 1},
				{0 ,0 ,1, 0},
				{0 ,1, 1, 0},
				{0 ,1, 0, 0},
				{1 ,1, 0, 0}};
		
		
int[][]arr1= {
		
		{1, 1, 1, 0, 1},
		{0, 0, 1, 0, 0},
		{1, 1, 0, 1, 0},
		{0, 1, 1, 0, 0},
		{0, 0, 0, 0, 0},
		{0, 1, 0, 0, 0},
		{0, 0, 1, 1, 0}
};
		
		System.out.println("Answer: "+ connectedCell(arr));
		System.out.println("Answer: "+ connectedCell(arr1));
		
	}
	
}
