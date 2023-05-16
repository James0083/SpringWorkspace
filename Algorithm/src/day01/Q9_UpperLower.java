package day01;

import java.util.Scanner;

public class Q9_UpperLower {
	
	public static String solution(String str) {
		String answer="";
		for(char c:str.toCharArray()) {
			if(Character.isLowerCase(c)) answer+=Character.toUpperCase(c);
			else answer+=Character.toLowerCase(c);
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("알파벳 문자열을 입력하세요");
		String str=sc.nextLine();
		System.out.println(solution(str));
	}

}
