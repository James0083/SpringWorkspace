package day05;

import java.util.Stack;

public class Q2_10 {
//카카오 크레인 인형뽑기
	public static void main(String[] args) {
		int[][] board = {
		        {0, 0, 0, 0, 0},
		        {0, 0, 1, 0, 3},
		        {0, 2, 5, 0, 1},
		        {4, 2, 4, 4, 2},
		        {3, 5, 1, 3, 1}
		};
	     int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
			    
		int result =solution(board, moves);
	    System.out.println("Result: " + result);

	}

	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st=new Stack<>();
        int n=board.length;
        for(int m:moves) {
        	for(int i=0;i<n;i++) {
        		int b=board[i][m-1];
        		if(b!=0) {
        			if(!st.isEmpty() && st.peek()==b) {
        				st.pop();
        				answer+=2;
        			}
        			else st.push(b);
        			board[i][m-1]=0;
        			break;
        		}
        	}
        }
        
        return answer;
    }
	
}
