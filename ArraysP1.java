package program;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysP1 {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("enter the size of the array");
int size=sc.nextInt();
int[] arr1=new int[size];
System.out.println("enter the values of the array");
for (int i = 0; i < arr1.length; i++)
{
	arr1[i] = sc.nextInt();
	
}
System.out.println(Arrays.toString(arr1));
int sum=0;
for (int i = 0; i < arr1.length; i++) {
	sum = sum+arr1[i];
	
}
System.out.println("sum of the array="+sum);
System.out.println("avg of the array="+sum/arr1.length);
	}

}
