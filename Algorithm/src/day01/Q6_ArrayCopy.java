package day01;

import java.util.Arrays;
import java.util.Scanner;

public class Q6_ArrayCopy {
	
	public static int[] inputArray(int nth) {
		Scanner sc=new Scanner(System.in);
		System.out.println("배열"+nth+" 요소수 입력: ");
		int num1=sc.nextInt();
		//배열 생성
		int[] arr=new int[num1];
		//반복문 돌면서 배열에 값 저장하기
		for(int i=0;i<num1;i++) {
			System.out.print("arr1["+i+"] : ");
			arr[i]=sc.nextInt();
		}
		return arr;
	}//--------------------------------
	
	//[1]
	public static void copy(int[] a, int[] b) {
		//배열 크기가 작은쪽 => 큰쪽 배열로 카피
		int num=(a.length>b.length)? b.length:a.length;
		for(int i=0;i<num;i++) {
			if(a.length<b.length) b[i]=a[i];
			else a[i]=b[i];
		}
		System.out.println("배열 a를 b로 카피 완료");
	}//--------------------------------
	//[2]
	public static void reverse_copy(int[] a, int[] b) {
		//역순으로 카피
		int num=(a.length>b.length)? b.length:a.length;
		for(int i=0;i<num;i++) {
			if(a.length<b.length) b[num-1-i]=a[i];
			else a[num-1-i]=b[i];
		}
		System.out.println("배열 a를 b로 카피 완료");
	}//--------------------------------
	
	public static int[] reverse(int[] a) {
		for(int i=0;i<a.length/2;i++) {
			int tmp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=tmp;
		}
		return a;
	}//--------------------------------

	public static void main(String[] args) {
		
		int a[]=inputArray(1);
		int b[]=inputArray(2);
		//copy...
//		copy(a, b);
//		reverse_copy(a, b);
		//a,b값 출력
		System.out.println("배열a: "+Arrays.toString(a));
		System.out.println("배열b: "+Arrays.toString(b));
		
		int b2[]=reverse(b);
		System.out.println("배열b2: "+Arrays.toString(b));
		
	}

}
