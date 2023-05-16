package day01;

import java.util.*;

public class Q13_Pallindrom {

	public static String solution(String str) {
		String answer="Yes~~";
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				answer="No!!";
				break;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("문자열을 입력하세요=>");
		String str=sc.next();
		
		System.out.println("회문 문자열이 맞아요? "+solution(str));
		
	}

}
