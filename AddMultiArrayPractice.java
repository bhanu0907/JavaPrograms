package program;

import java.util.Arrays;
import java.util.Scanner;

public class AddMultiArrayPractice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the row");
		int rowSize1=sc.nextInt();
		int [][]arr1=new int[rowSize1][];
		for(int i=0;i<rowSize1;i++){
			System.out.println("enter the size of the column"+i);
			int columnSize1=sc.nextInt();
			arr1[i]=new int[columnSize1];
			System.out.println("enter the value of coulmn"+i);
			for(int j=0;j<columnSize1;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rowSize1;i++) {
			System.out.println(Arrays.toString(arr1[i]));
		}
		System.out.println("enter the size of the 2nd row");
		int rowSize2=sc.nextInt();
		int [][]arr2=new int[rowSize2][];
		for(int i=0;i<rowSize2;i++) {
			System.out.println("enter the size of 2nd column");
			int columnSize2=sc.nextInt();
			arr2[i]=new int[columnSize2];
			System.out.println("enter the values of 2nd column");
			for(int j=0;j<columnSize2;j++)
				arr2[i][j]=sc.nextInt();
		}
		for(int i=0;i<rowSize2;i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}
	//	System.out.println("3rd array");
		int	arr3 [][]=new int[arr1.length][];
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=new int[arr1[i].length];
			for(int j=0;j<arr1[i].length;j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("output:");
		for(int i=0;i<arr3.length;i++) {
			System.out.println(Arrays.toString(arr3[i]));
		}
		sc.close();
	}

}

