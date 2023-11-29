package program;

public class FactroialAndSTrong {
	public static void main(String[] args) {
		int a=145;
		int fact=1;
		int strong=a;
		int sum=0;
		for(int i=0;a>0;i++)
		{
			int rem=strong%10;
			fact=fact*rem;
			sum =sum=fact;
			rem--;
			a=a/10;
		}
		if(fact==strong) {
			System.out.println(strong);
		System.out.println("strong");
		}
		else {
			System.out.println("not strong");
		}
	}

}
