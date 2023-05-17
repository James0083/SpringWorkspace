package day01;

import java.util.Scanner;

public class Q12_MatrixSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] mat=new int[n+1][n+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				mat[i][j]= sc.nextInt()+mat[i-1][j]+mat[i][j-1]-mat[i-1][j-1];
			}
		}
		int[] answer=new int[m];
		for(int i=0;i<m;i++) {
			int x1=sc.nextInt();
			int y1=sc.nextInt();
			int x2=sc.nextInt();
			int y2=sc.nextInt();
			answer[i]=mat[x2][y2]-mat[x2][y1-1]-mat[x1-1][y2]+mat[x1-1][y1-1];
		}
		for(int i=0;i<m;i++) {
			System.out.println(answer[i]);
		}
	}

}
