package program;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysReverseP6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size =sc.nextInt();
		boolean [] names=new boolean[size];
		System.out.println("enter the boolean");
		for(int i=0;i<size;i++) {
			names[i]=sc.nextBoolean();
			
		}
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);			
		}
		System.out.println(Arrays.toString(names));
		boolean [] reverseNames=new boolean[names.length];
		for (int i = 0; i < reverseNames.length; i++) {
			reverseNames[names.length-i-1]=names[i];
			
		}
		System.out.println(Arrays.toString(reverseNames));
	}

}
