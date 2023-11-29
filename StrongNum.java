package program;
public class StrongNum {


	public static void main(String[] args) {
		int num=145;
		int num2=num;
		int sum=0;
		while(num>0) {
			int rem=num%10;
			int fact=1;
			for (int i = 1; i < rem; i++) {
				fact=fact*i;
				
			}sum=sum+fact;
			num=num/10;
		}if(sum==num2)
		{
			
			System.out.println("it is a Strong number");
		}else {
			System.out.println("it is not a Strong number");
			System.out.println(sum);
		}

	}
}
