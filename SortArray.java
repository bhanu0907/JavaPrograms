package program;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size =sc.nextInt();
		int []arr=new int[size];
//		int first=arr[0];
		System.out.println("enter the values");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("array elements are="+Arrays.toString(arr));
		int first=arr[0];
		for (int j = 0; j < arr.length; j++) {
			if(first>arr[j+1]) {
				first=arr[j+1];
				System.out.println(first);
			}
		}
	}

}
