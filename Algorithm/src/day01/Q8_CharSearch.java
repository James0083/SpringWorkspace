package day01;

import java.util.*;

public class Q8_CharSearch {
	
	public static int solution(String str, char ch) {
		int cnt=0;
		str=str.toLowerCase();
		ch=Character.toLowerCase(ch);
		for(char ss:str.toCharArray()) {
			if(ss==ch) cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("문자열을 입력하세요: ");
		String str=sc.nextLine();
		System.out.println("검색할 문자 한자를 입력하세요:");
		char ch=sc.next().charAt(0);
		int cnt=solution(str, ch);
		System.out.println("검색한 문자 "+ch+"는 "+cnt+"개 있어요");
		
	}

}
