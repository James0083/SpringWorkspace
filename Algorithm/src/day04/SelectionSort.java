package day04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요");
		int n=sc.nextInt();
		int arr[]=new int[n];
		Random ran=new Random();
		for(int i=0;i<n;i++) {
			//1<= r < 20
			arr[i]=ran.nextInt(20)+1;
		}
		System.out.println(Arrays.toString(arr));
		selectSort(arr);
		System.out.println("----선택 정렬 후----------");
		System.out.println(Arrays.toString(arr));

	}
	
	//선택정렬: 최소(또는 최대)값을 선택해서 해당 값을 앞 위치부터 가져다두는 형태 
	public static void selectSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int minIdx=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minIdx]>arr[j]) {
					minIdx=j;
				}
			}//for----
			int tmp=arr[minIdx];
			arr[minIdx]=arr[i];
			arr[i]=tmp;
//			System.out.println(Arrays.toString(arr));
		}//for-----------
		
	}
	
}
