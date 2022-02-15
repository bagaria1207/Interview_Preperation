package matrix;

public class KthElement {
	public static void printKtSpriral(int[][] arr, int rows, int colums, int k){
		//To keep the count of total elements in matrix
		int total = 0;
		int row = 0;
		int col = 0;
		while(row < rows && col < colums){
			for(int i=col; i<colums; i++){
				total++;
				if(total == k){
					System.out.println(arr[row][i]);
					return;
				}				
			}
			row++;
			
			for(int i=row; i<rows; i++){
				total++;
				if(total == k){
					System.out.println(arr[i][colums-1]);
					return;
				}
			}
			colums--;
			
			if(row < rows) {
				for(int i=colums-1;i>=col;i--) {
					total++;
					if(total == k) {
						System.out.println(arr[rows-1][i]);
						return;
					}
				}
				rows--;
			}
			
			if(col < colums) {
				for(int i=rows-1; i>=row; i--) {
					total++;
					if(total == k) {
						System.out.println(arr[i][col]);
						return;
					}
				}
				col++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[][]{  {1,  2,  3, 4},
									{12, 13, 14, 5}, 
									{11, 16, 15, 6},
									{10,  9,  8, 7}};
			printKtSpriral(arr, arr.length, arr[0].length, 16);
	}

}
