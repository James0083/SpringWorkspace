package day02;

import java.util.Arrays;
import java.util.Scanner;

public class QQ_Practice {

	static Scanner sc=new Scanner(System.in);
	
	//좌표 정렬하기
	public static void PointSort() {
		System.out.print("좌표 개수 입력: ");
		int n=sc.nextInt();
		Point[] parr=new Point[n];
		for(int i=0;i<n;i++) {
			System.out.print("좌표"+(i+1)+" 입력: ");
			parr[i]=new Point(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(parr);
		for(int i=0;i<n;i++) {
			System.out.println(parr[i].toString());
		}
	}

	//국어 성적 등수 구하기 - 성적 받기
	public static void LanguageRank() {
		System.out.print("학생 수 입력: ");
		int n=sc.nextInt();
		int[] record=new int[n];
		System.out.println("국어 성적 5개 입력:");
		for(int i=0;i<n;i++) {
			record[i]=sc.nextInt();
		}
		int[] rank=new int[n];
		for(int i=0;i<record.length;i++) {
			rank[i]=1;
			for(int j=0;j<record.length;j++) {
				if(record[i]<record[j]) rank[i]++;
			}
		}
		System.out.println(Arrays.toString(rank));
	}
	
	//격자판 최대합 구하기
	public static void MaxSum() {
		System.out.print("격자판(NxN) 사이즈(N) 입력: ");
		int n=sc.nextInt();
		int[][] mat=new int[n][n];
		System.out.println("격자판 값 입력:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		int[] sums=new int[2*n+2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				sums[i]+=mat[i][j];
				sums[n+i]+=mat[j][i];
			}
			sums[2*n]+=mat[i][i];
			sums[2*n+1]+=mat[n-1-i][i];
		}
		int max=0;
		for(int i=0;i<sums.length;i++) {
			max=(max>sums[i])?max:sums[i];
		}
		System.out.println("격자판 최대합: "+max);
	}
	
	//두 배열 합치기
	public static void AbsorpArrays() {
		int[] n=new int[3];
		for(int i=1;i<3;i++) {
			System.out.print("배열"+i+"의 개수: ");
			n[i]=sc.nextInt();
		}
		int[] arr=new int[n[1]+n[2]];
		for(int i=0;i<2;i++) {
			System.out.print("배열"+i+"에 저장할 값을 오름차순 입력: ");
			for(int j=0;j<n[i+1];j++) {
				arr[n[i]+j]=sc.nextInt();
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	//두 배열의 공통원소 추출
	public static void SameElement() {
		int[] n=new int[2];
		for(int i=0;i<2;i++) {
			System.out.print("배열"+(i+1)+"의 개수: ");
			n[i]=sc.nextInt();
		}
		int arr[]=new int[n[0]];
		System.out.print("배열1에 저장할 값을 오름차순 입력: ");
		for(int j=0;j<n[0];j++) {
			arr[j]=sc.nextInt();
		}
		System.out.print("배열2에 저장할 값을 오름차순 입력: ");
		for(int j=0;j<n[1];j++) {
			int a=sc.nextInt();
			int i=0;
			while(i<n[0] && arr[i]<=a) {
				if(arr[i++]==a) {
					System.out.print(a+" ");
					continue;
				}
			}
		}
	}
	
	public static void main(String[] args) {

//		PointSort();
//		LanguageRank();
//		MaxSum();
//		AbsorpArrays();
		SameElement();
		
	}

}
