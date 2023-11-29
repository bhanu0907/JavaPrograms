package program;

import java.util.Arrays;
//import java.util.Iterator;
import java.util.Scanner;

public class MultiArraryPractice {
	public static void main(String[] args) {
		//		Scanner sc=new Scanner(System.in);
		//		System.out.println("enter the size of the row");
		//		int rowSize=sc.nextInt();
		//		int [][]arr=new int[rowSize][];
		//		for(int i=0;i<rowSize;i++) {
		//			System.out.println("enter the column size in the row");
		//			int	colunmSize=sc.nextInt();
		//			arr[i]=new int[colunmSize];
		//		}
		//	for (int i = 0; i < arr.length; i++) {
		//		System.out.println(Arrays.toString(arr));
		//		
		//	}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the row");
		int rowSize=sc.nextInt();
		int[][] arr=new int[rowSize][];
		for(int i= 0; i<rowSize;i++) {
			System.out.println("enter the size of the column"+i);
			int columnSize=sc.nextInt();
			arr[i]=new int[columnSize];
			System.out.println("enter the column values"+i);
			for (int j = 0; j < columnSize; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < rowSize; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <arr.length; j++) {
				sum=sum+arr[i][j];
			}

		}
		System.out.println(sum);
	}}
