package program;
import java.util.Arrays;
import java.util.Scanner;
public class ArraypP2Merging {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter th size of the first array");
		int size1st =sc.nextInt();
		int[] arr1=new int[size1st];
		
		System.out.println("enter the values of the 1st array");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextInt();

		}
		System.out.println("enter the size of second array");
		int size2nd=sc.nextInt();
		int[] arr2=new int[size2nd];
		System.out.println("enter the values of the third array");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=sc.nextInt();
		}
		int[] arr3rd=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			arr3rd[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			arr3rd[i+arr1.length]=arr2[i];
			
		}
		System.out.println(Arrays.toString(arr3rd));
	}

}
