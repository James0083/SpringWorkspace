package day01;

import java.util.Scanner;
/* https://www.acmicpc.net/problem/11660
 * 
4 3

1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7

2 2 3 4
3 4 3 4
1 1 4 4
 */
public class Q12_MatrixSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int[][] arr=new int[n+1][n+1];
		int[][] mat=new int[n+1][n+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				arr[i][j]=sc.nextInt();
				mat[i][j]= arr[i][j]+mat[i-1][j]+mat[i][j-1]-mat[i-1][j-1];
			}//for-----
		}//for--------------------
		printArray(arr);
		printArray(mat);
		
		int[] answer=new int[m];
		for(int i=0;i<m;i++) {
			int x1=sc.nextInt();
			int y1=sc.nextInt();
			int x2=sc.nextInt();
			int y2=sc.nextInt();
			answer[i]=mat[x2][y2]-mat[x2][y1-1]-mat[x1-1][y2]+mat[x1-1][y1-1];
		}//for---------
		for(int i=0;i<m;i++) {
			System.out.println(answer[i]);
		}
	}//-------------------------
	
	public static void printArray(int[][] arr) {
		for(int[] a:arr) {
			for(int b:a) {
				System.out.printf("%3d", b);
			}
			System.out.println("");
		}
		System.out.println("------------------");
	}//-------------------

}
