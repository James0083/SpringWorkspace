package day01;

import java.util.Arrays;
import java.util.Scanner;

public class Q2_Median {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("3개의 정수를 입력하세요");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int result=median(a, b, c);

		System.out.println("중간값: "+result);
	}
	
	public static int median(int a, int b, int c) {
//		int[] arr= {a,b,c};
//		Arrays.sort(arr);
//		return arr[1];
		
		int max=(a>b)?a:b;
		max=(max>c)?max:c;
		int min=(a<b)?a:b;
		min=(min<c)?min:c;
		int median=a+b+c-max-min;
		return median;
		
//		if(a>=b) {
//			if(b>=c) {
//				return b;
//			}else {
//				if(a>=c) return c;
//				else return a;
//			}
//		}else { //b>a
//			if(a>=c) return a;
//			else {
//				if(b>=c) return c;
//				else return b;
//			}
//		}
	}
	
}
