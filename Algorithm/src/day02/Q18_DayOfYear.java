package day02;
import java.util.*;
public class Q18_DayOfYear {
	int[][] mdays= {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},//평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}//윤년
	};
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		int no=0;
		do {
			System.out.print("년도: ");
			int year=sc.nextInt();
			System.out.print("월 : ");
			int month=sc.nextInt();
			System.out.print("일 : ");
			int day=sc.nextInt();
			
			int totalDays=getDayOfYear(year, month, day);
			
			System.out.printf("%d년 %d일째 입니다%n", year, totalDays);
			
			System.out.println("한번 더 하시겠습니까? [1. yes 2. no]");
			no=sc.nextInt();
		}while(no==1);
		System.out.println("Bye Bye~~");
	}//-------------------
	/* 윤년 : 년도를 4로 나누어 떨어지면서 100으로는 나누어 떨어지면 안된다. 
	 *       다만 400으로 나누어 떨어지면 윤년
	 * 
	 *  */
	public int getDayOfYear(int yy, int mm, int dd) {
		int total=0;
//		if(yy%400==0 || (yy%100!=0 && yy%4==0)) {//윤년
//			for(int i=0;i<mm-1;i++) {
//				System.out.println((i+1)+"월: "+mdays[1][i]+"일");
//				total+=mdays[1][i];
//			}
//			System.out.println(mm+"월: "+dd+"일");
//			total+=dd;
//		}else {//평년
//			for(int i=0;i<mm-1;i++) {
//				System.out.println((i+1)+"월: "+mdays[0][i]+"일");
//				total+=mdays[0][i];
//			}
//			System.out.println(mm+"월: "+dd+"일");
//			total+=dd;
//		}
		//---
		int leap=(yy%400==0 || (yy%100!=0 && yy%4==0))? 1:0;
		for(int i=0;i<mm-1;i++) {
			System.out.println((i+1)+"월: "+mdays[leap][i]+"일");
			total+=mdays[leap][i];
		}
		System.out.println(mm+"월: "+dd+"일");
		total+=dd;
		
		return total;
	}
	
	public static void main(String[] args) {
		Q18_DayOfYear app=new Q18_DayOfYear();
		app.input();

	}

}
