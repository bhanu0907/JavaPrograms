package program;

public class NewArmStrongPractice {
	public static void main(String[] args) {
		int num=153;
		int orginal=num;
		int armStrong=0;
		int rem=0;
		for(int i=0;num>0;i++);
		{
			rem=num%10;
			rem=rem*rem*rem;
			armStrong=armStrong+rem;
			num=num%10;
		}
		System.out.println(armStrong);
		if(orginal==armStrong) {
			System.out.println("arm strong");	
		}
		else {
			System.out.println("not a arm strong");
		}
	}

}
