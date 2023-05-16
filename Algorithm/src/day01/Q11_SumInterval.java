package day01;

import java.util.*;

public class Q11_SumInterval {
	static Scanner sc=new Scanner(System.in);
	
	public static int[] solution(int n, int m) {
		int[] answer=new int[m];
		int[] arr=new int[n];
		int[] sumArr=new int[n+1];
		System.out.println("저장할 숫자 "+n+"개 입력하세요");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sumArr[i+1]=sumArr[i]+arr[i];
		}//for-----------
		System.out.println("arr: "+Arrays.toString(arr));
		System.out.println("sumArr: "+Arrays.toString(sumArr));
		int start,end;
		for(int i=0;i<m;i++) {
			start=sc.nextInt();
			end=sc.nextInt();
			answer[i]=sumArr[end]-sumArr[start-1];
		}
		return answer;
	}
	
	public static int[] solution2(int n, int m) {
		//배열 활용
		int[] answer=new int[m];
		System.out.println("저장할 숫자 "+n+"개 입력하세요");
		int[] arr=new int[n];
//		String[] temp=sc.nextLine().split(" ");
		for(int i=0;i<n;i++) {
//			arr[i]=Integer.parseInt(temp[i]);
			arr[i]=sc.nextInt();
		}
		int start,end;
		for(int i=0;i<m;i++) {
//			String[] ts=sc.nextLine().split(" ");
//			start=Integer.parseInt(ts[0]);
//			end=Integer.parseInt(ts[1]);
			System.out.println("구간 정보를 입력하세요 (start, end)");
			start=sc.nextInt();
			end=sc.nextInt();
			for(int j=start-1;j<end;j++) {
				answer[i]+=arr[j];
			}
			
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println("N과 M을 입력하세요");
		int N=sc.nextInt();
		int M=sc.nextInt();
//		String[] sarr=sc.nextLine().split(" ");
//		int N=Integer.parseInt(sarr[0]);
//		int M=Integer.parseInt(sarr[1]);
		int[] sum=solution(N, M);
		for(int s:sum) System.out.println(s);
	}

}
