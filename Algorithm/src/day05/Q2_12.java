package day05;

import java.util.Scanner;

public class Q2_12 {
//암호 해독
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("문자개수 입력(8이하로): ");
		int n=sc.nextInt();
		System.out.println("암호문자 입력: ");
		String str=sc.next();
		System.out.println(str.length()+"개를 입력했어요");
		System.out.println(translate(str));
	}

	private static String translate(String str) {
		String result="";
		
//		String tmp="";
//		for(char c:str.toCharArray()) {
//			if(c=='*') tmp+=0;
//			else if(c=='#') tmp+=1;
//			
//			if(tmp.length()>=7) {
//				result+=(char)Integer.parseInt(tmp, 2);
//				tmp="";
//			}
//		}
		
		str = str.replace('#','1').replace('*','0');
		for(int i=0;i<str.length();i+=7) {
			result+=(char)Integer.parseInt(str.substring(i, i+7), 2);
		}
		return result;
	}
	
}
//#**##**#**####*##**###****##