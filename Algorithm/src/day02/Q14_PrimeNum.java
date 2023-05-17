package day02;

import java.util.*;

public class Q14_PrimeNum {
	
	public static void main(String[] args) {
		int cnt=0;
		for(int i=2;i<1000;i++) {
			int j;
			for(j=2;j<i;j++) {
				cnt++;
				if(i%j==0) {
					break;
				}
			}
			if(i==j) {
				System.out.print(" "+i);
			}
		}
		System.out.println("\n수행횟수: "+cnt);
	}
	
}
