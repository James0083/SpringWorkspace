package day01;

public class Q1_Max {
	
	public static int max2(int a, int b) {
		return (a>b)?a:b;
	}
	public static int max3(int a, int b, int c) {
		int max=(a>b)?a:b;
		max=(max>c)?max:c;
		return max;
	}
	public static int max4(int a, int b, int c, int d) {
		int max1=(a>b)?a:b;
		int max2=(c>d)?c:d;
		return (max1>max2)?max1:max2;
	}

	public static void main(String[] args) {
		int a=50;
		int b=133;
		int c=45;
		int d=82;
		
		System.out.println(max2(a, c));
		
		int mx=max3(a,b,c);
		System.out.printf("%d, %d, %d 중 최대값: %d%n", a, b, c, mx);
		
		mx=max3(a,c,d);
		System.out.printf("%d, %d, %d 중 최대값: %d%n", a, c, d, mx);
		
		mx=max4(a,b,c,d);
		System.out.printf("%d, %d, %d, %d 중 최대값: %d%n", a, b, c, d, mx);
	}

}
