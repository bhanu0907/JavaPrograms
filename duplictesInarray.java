package program;

import java.util.ArrayList;
import java.util.Arrays;

public class duplictesInarray {

		public static void main(String[] args) {
			int[] a= {10,20,39,10,39,10,10 };
	
			int count =0;
			//boolean flag=true;
		//	ArrayList<Integer> b=new ArrayList<>();
			
			for(int i=0;i<a.length;i++) {
				//boolean flag=true;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					System.out.println(a[i]);
					break;
			
				}
			
			}
			
			}
			System.out.println(count);
//	public static void main(String[] args) {
//		String a="bhadfsgfhgcjjtfftilp";
//		char []ch=a.toCharArray();
//		System.out.println(Arrays.toString(ch));
//		int count=0;
//		char []duplicate=new char[a.length()];
//		for(int i=1;i<ch.length-1;i++)
//		{
//			//boolean flag=false;
//
//			for(int j=i+1;j<ch.length;j++)
//				if(ch[i]==ch[j]) {
//					System.out.println(ch[i]);
//					duplicate[i]=ch[i];
//					count++;
//					
//					break;
//				}
//			//flag=true;
//
//			//break;
//

	//	}
//		System.out.println(count);
//		Arrays.sort(duplicate);
//		System.out.println(Arrays.toString(duplicate));
	}
}


