package day02;

import java.util.*;
/*이진검색
 * - 정렬됭 있는 자료구조를 이용해야 함
 * - O(log n)
 *  100개의 데이터가 있다면 O(log 100) => 최악의 경우 7번만에 검색을 마칠 수 있다.
 * */
public class Q20_BinarySearch {
	//배열: Arrays.sort(배열)
	//리스트: Collections.sort(리스트)
	
	public static int solution(int [] arr, int n, int key) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int left=0;
		int right=n-1;
		
		int center=(left+right)/2;//중앙값
		int cnt=0;
		while(left<=right) {
			cnt++;
			if(arr[center]==key) {
				System.out.println(cnt+"번만에 찾았어요");
				return center;
			}
			else if (arr[center]<key) {
				left=center+1;
			}else if (arr[center]>key) {
				right=center-1;
			}
			center=(left+right)/2;
		}
		return -1;
		
	}//----------------------
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("배열 크기 입력: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("저장할 데이터 입력: ");
		for(int i=0;i<n;i++) {
			arr[i]=(int)(Math.random()*100)+1; //sc.nextInt();
		}
		System.out.println("검색할 데이터 입력: ");
		int key=sc.nextInt();
		
		int idx=solution(arr, n, key);
		//겁색 값이 없으면 -1을 반환하고 있으면 해당 인덱스 번호 반환
		System.out.println((idx==-1)?key+"값은 배열에 없습니다":key+"값은 배열인덱스 "+idx+"에 있어요");

	}
	
}
