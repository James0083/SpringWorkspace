package day04;

import java.util.Scanner;

public class BinaryNum {
	
	public static void solution(int num) {
		if(num<=0) return;
		solution(num/2);
		System.out.print(num%2);
	}
	
	public static void solution2(int num, int b) {
		if(num<=0) return;
		solution2(num/b, b);
		System.out.print(num%b);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요");
		int num=sc.nextInt();
		
//		solution(num);
		
		System.out.println("몇진수로 변환할지 입력하세요");
		int b=sc.nextInt();
		solution2(num, b);

	}

}
