package day04;

import java.util.Scanner;

public class Factorial {
	
	public static int factorial(int num) {
		if(num<=1) return 1;
		return factorial(num-1)*num;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요");
		int num=sc.nextInt();
		System.out.println("factorial("+num+")= "+factorial(num));
		
	}
}
