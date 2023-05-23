package day05;

import java.util.Scanner;

public class Q2_09 {
//괄호안 문자 제거
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("문자열을 입력하세요: ");
		String str=sc.next();
		System.out.println(solution(str));
	}
	
	private static String solution(String str) {
		String result="";
		int canRemove=0;
		for(char c:str.toCharArray()) {
			if(c=='(') canRemove++;
			else if(c==')') canRemove--;
			else {
				if(canRemove<=0) result+=c;
			}
		}
		
		return result;
	}
}
//(A(BC)DE)F(G(H)(IJ)K)LM(N)OP(Q)R(STU)V(W(XY)Z)