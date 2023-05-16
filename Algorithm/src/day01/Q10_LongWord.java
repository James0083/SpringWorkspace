package day01;

import java.util.*;

public class Q10_LongWord {
	
	public static String solution1(String str) {
		String word="";//문자열중 제일 긴 단어 반환
		String[] sarr=str.split(" ");
		for(String s:sarr) {
			if(s.length()>word.length()) word=s;
		}
		
		return word;
	}//------------------------------
	
	//int indexOf("검색 문자열") : 검색한 문자열의 인덱스 번호를 반환한다. 검색한 문자열이 없다면 -1을 반환한다
	//String substring(int start, int end) : start인덱스에서 시작해서 end-1까지 오려내서 반환
	//String substring(int start) : start에서 끝까지 오려내서 반환
	public static String solution(String str) {
		String word="";
		int pos=0;
		int max=-9999;
		while((pos=str.indexOf(" "))!=-1) {
			String wd=str.substring(0,pos);//Never
			if(wd.length()>max) {
				max=wd.length();
				word=wd;
			}
			str=str.substring(pos+1);
			System.out.println(str);
		}
		if(str.length()>max) {
			max=str.length();
			word=str;
		}
		
		return word;
	}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("문자열을 입력하세요: ");
		String str=sc.nextLine();
		System.out.println(solution(str));

	}

}
