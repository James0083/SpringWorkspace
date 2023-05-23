package day05;

import java.util.Scanner;

public class Q2_11 {
//문자열 압축
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("문자열을 입력하세요: ");
		String str=sc.next();
		System.out.println(solution(str));
	}

	private static String solution(String str) {
		String result="";
		int n=1;
		for(char c:str.toCharArray()) {
			if(!result.isEmpty() && c==result.charAt(result.length()-1)) {
				n++;
			}else {
				if(n>1) result+=n;
				n=1;
				result+=c;
			}
		}
		if(n>1) result+=n;
		return result;
	}

}
