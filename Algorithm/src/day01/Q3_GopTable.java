package day01;

public class Q3_GopTable {
	
	public static void solution() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(i==0) {
					if(j==0) System.out.print("    |");
					else System.out.print("  "+j);
				}
				else {
					if(j==0) System.out.print("  "+i+" |");
					else System.out.printf("%3d",j*i);
				}
			}
			System.out.println("");
			if(i==0) System.out.println("----+-------------------------------");
		}
	}

	public static void main(String[] args) {
		
		solution();

	}

}
