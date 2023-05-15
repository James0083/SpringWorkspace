package day01;

import java.util.Arrays;
import java.util.Scanner;

public class Q4_ArrayMaxMin {
	
	//최대, 최소값을 배열에 담아서 반환
	public static int[] solution(int[] heights) {
		int[] answer=new int[2];//최대키, 최소키값을 저장할 배열
		
		//방법1 => Arrays.sort() 이용
//		Arrays.sort(heights);
//		answer[0]=heights[0];
//		answer[1]=heights[heights.length-1];
		
		//방법2 => 전체 정렬
//		int temp=0;
//		for(int i=0;i<heights.length;i++) {
//			for(int j=i+1;j<heights.length;j++) {
//				if(heights[i]<heights[j]) {
//					temp=heights[i];
//					heights[i]=heights[j];
//					heights[j]=temp;
//				}
//			}
//		}
//		answer[0]=heights[0];
//		answer[1]=heights[heights.length-1];
		
		//방법3 => 최댓값, 최솟값만 찾음
		answer[0]=heights[0];
		answer[1]=heights[0];
		int t=0;
		for(int i=1;i<heights.length;i++) {
			if(answer[0]<heights[i]) {
				t=answer[0];
				answer[0]=heights[i];
				heights[i]=t;
			}
			if(answer[1]>heights[i]) {
				t=answer[1];
				answer[1]=heights[i];
				heights[i]=t;
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("사람수를 입력하세요 [키의 최대, 최소값을 구합니다]");
		int num=sc.nextInt();
		//반복문 돌면서 height에 랜덤한 키값을 저장하기(100~190)
		int[] heights=new int[num];
		System.out.println("랜덤한 키값 생성----");
		for(int n=0;n<num;n++) {
			heights[n]=(int)(Math.random()*90)+100;
			System.out.println("heights["+n+"] : "+heights[n]);
		}
		//제일 큰키
		//제일 작은키
		int[] minmax=solution(heights);
		System.out.println("제일 큰 키: "+minmax[1]+"\n제일 작은 키: "+minmax[0]);
	}

}
