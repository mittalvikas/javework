
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.List;

// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution {
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	int minimumDistance(int numRows, int numColumns, List<List<Integer>> area) {
//
		int[][] visited = new int[numRows][numColumns];
		Integer[][]matrix=getmatrix(area);
		int[] destination=locateDestination(matrix);
		int result=findShortestPath(matrix,visited,0,0,destination[0],destination[1],Integer.MAX_VALUE,0,numRows,numColumns);
		
		return result;
	}

	static Integer[][] getmatrix(List<List<Integer>> lists) {
		Integer[][] array = new Integer[lists.size()][];
		Integer[] blankArray = new Integer[0];
		for (int i = 0; i < lists.size(); i++) {
			array[i] = lists.get(i).toArray(blankArray);
		}

		return array;
	}

	static int[] locateDestination(Integer[][] board) {
		int[] cordinates = new int[2];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 9) {
					cordinates[0] = i;
					cordinates[1] = j;
				}
			}
		}
		return cordinates;
	}

	static boolean isSafe(Integer mat[][], int visited[][], int x, int y) {
		return !(mat[x][y] == 0 || visited[x][y] != 0);
	}

	
	static boolean isValid(int x, int y, int M, int N) {
		return (x < M && y < N && x >= 0 && y >= 0);
	}

	 static int findShortestPath(Integer mat[][], int visited[][], int i, int j, int x, int y, int min_dist, int dist,
			int M, int N) {
		// if destination is found, update min_dist
		if (i == x && j == y) {
			return Integer.min(dist, min_dist);
		}

		// set (i, j) cell as visited
		visited[i][j] = 1;

		// go to bottom cell
		if (isValid(i + 1, j, M, N) && isSafe(mat, visited, i + 1, j)) {
			min_dist = findShortestPath(mat, visited, i + 1, j, x, y, min_dist, dist + 1, M, N);
		}

		// go to right cell
		if (isValid(i, j + 1, M, N) && isSafe(mat, visited, i, j + 1)) {
			min_dist = findShortestPath(mat, visited, i, j + 1, x, y, min_dist, dist + 1, M, N);
		}

		// go to top cell
		if (isValid(i - 1, j, M, N) && isSafe(mat, visited, i - 1, j)) {
			min_dist = findShortestPath(mat, visited, i - 1, j, x, y, min_dist, dist + 1, M, N);
		}

		// go to left cell
		if (isValid(i, j - 1, M, N) && isSafe(mat, visited, i, j - 1)) {
			min_dist = findShortestPath(mat, visited, i, j - 1, x, y, min_dist, dist + 1, M, N);
		}

		// Backtrack - Remove (i, j) from visited matrix
		visited[i][j] = 0;

		return min_dist;
	}

	public static void main(String[] args) {

	}

	// METHOD SIGNATURE ENDS
}