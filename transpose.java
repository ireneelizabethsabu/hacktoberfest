import java.util.Scanner;

class Transpose{

	public static void main(String args[]){
		
		Scanner scanner= new Scanner(System.in);
	
		System.out.print("Enter the size of the matrix A: ");
		int m = scanner.nextInt();
		int n = scanner.nextInt();
				
		int[][] A = new int[m][n];
		
		System.out.println("Enter elements of matrix A: ");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
				A[i][j] = scanner.nextInt();
		}
		System.out.println("TRANSPOSE A: ");
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(A[j][i] + " ");
			}
			System.out.println(" ");
		}
	}
}
