package day01;

import java.util.Scanner;

public class Q5_ArrayEquals {
	
	public int[] inputArray(int nth) {
		Scanner sc=new Scanner(System.in);
		System.out.println("배열"+nth+"요소수 입력: ");
		int num1=sc.nextInt();
		//배열 생성
		int[] arr=new int[num1];
		//반복문 돌면서 배열에 값 저장하기
		for(int i=0;i<num1;i++) {
			System.out.print("arr1["+i+"] : ");
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	public static boolean solution(int[] arr1, int[] arr2) {
		
		if(arr1.length!=arr2.length) return false;
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i] != arr2[i]) return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		Q5_ArrayEquals app=new Q5_ArrayEquals();
		//inputArray()호출해서 배열 2개 반환하기
		int[] arr1 = app.inputArray(1);
		int[] arr2 = app.inputArray(2);

//		if(solution(arr1,arr2)) System.out.println("배열 a와 b는 같습니다.");
//		else  System.out.println("배열 a와 b는 같지 않습니다.");
		System.out.println( solution(arr1,arr2) ? "배열 a와 b는 같습니다.":"배열 a와 b는 같지 않습니다.");
	}

}
