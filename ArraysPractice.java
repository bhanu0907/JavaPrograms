package program;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class ArraysPractice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		int [] arr=new int[size];
	System.out.println("enter values of the array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
	}
		System.out.println(Arrays.toString(arr));
int sum =0;
for(int i=0; i<arr.length;i++)
{
	sum=sum+arr[i];
	
}
System.out.println(sum);
System.out.println(sum/arr.length);

}}
