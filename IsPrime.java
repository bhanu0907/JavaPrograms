package program;
import java.util.Iterator;
import java.util.Scanner;

public class IsPrime {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	int num2=sc.nextInt();
//	int count=0;
	boolean isTrue=true;
	

	
	for (int i = num1; i < num2; i++) {
		if(num1%i==0) {
			
			isTrue=false;
		}
		num1++;
//		System.out.println(num1++);
		
	}if(isTrue==true) {
		
		System.out.println(isTrue);
	}else {
		System.out.println(isTrue);
	}
	
	
	


}
}
