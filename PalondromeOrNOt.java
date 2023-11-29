package program;

public class PalondromeOrNOt {
	public static void main(String[] args) {
		int num=121;
		int number=num;
		int rev=0;
		for(int i=0;num>0;i++) {
		int	rem=num%10;
			rev=(rev * 10)+rem;
			num=num/10;
		}
		System.out.println(rev);
		if(rev==number) {
			System.out.println("number is palindrome");
		}
		else{
			System.out.println("not a palindrome");
		}
		//		
		////		System.out.println(isPalindrome(454));
		////		
		//	}
		//		public static boolean isPalindrome(int n)
		//		{
		//			int a=n;
		//			int rev=0;
		//			while (n > 0)
		//			{
		//				int rem = n%10;
		//				rev = (rev * 10) + rem;
		//				n = n/10;
		//			}
		//			return rev==a;
	}
}


