package day01;

import java.util.Scanner;

public class Q7_NumConv {
	
	public static void main(String[] args) {
		char[] arr=new char[32];//int 크기=>32
		Scanner sc=new Scanner(System.in);
		System.out.println("정수(양수) 입력: ");
		int num=sc.nextInt();
		System.out.println("몇 진수로 변환할까요? (2~36)");
		int radix=sc.nextInt();
		solution(num, radix, arr);
		
		String s="";
		for(char c:arr) s=c+s;
		System.out.println(s);
	}

	public static void solution(int num, int radix, char[] arr) {
		System.out.printf("%d를 %d진수로 변환: %n", num, radix);
		String str="0123456789ABCDEFGHIJKLMNOPQRXTUVWXYZ";
		for(int i=0;num>0;i++) {
//			arr[i]=(char)( ((num%radix>9)?'A'-10:'0') + (num%radix));
			arr[i]=str.charAt(num%radix);
			num/=radix;
		}
	}

}
