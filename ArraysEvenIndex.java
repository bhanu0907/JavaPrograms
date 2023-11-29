package program;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysEvenIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size =sc.nextInt();
		int [] arr=new int[size];
		System.out.println("enter the values of the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();

		}
		System.out.println(Arrays.toString(arr));
		int sumOfEvenIndex=0;
		int index=0;
		System.out.println("elements present inside even index");
		for (int i = 0; i < arr.length; i++) {
		if (i%2==0) {
			System.out.println("elements of even index"+arr[i]);
			sumOfEvenIndex=sumOfEvenIndex+arr[i];
		//	index=i;
		//sumIndex=sumIndex+arr[i];
	//	System.out.println(sumIndex);
		
			
		}
		System.out.println(sumOfEvenIndex);
		
	//	System.out.println(index);
		//System.out.println(sumIndex/index);
	}

}}
