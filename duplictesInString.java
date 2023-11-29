package program;

import java.util.Arrays;

public class duplictesInString {

	public static void main(String[] args) {
				String a="bhanubhanu";
				char []ch=a.toCharArray();
				System.out.println(Arrays.toString(ch));
				int count=0;
				for(int i=0;i<ch.length;i++)
				{
					for(int j=i+1;j<ch.length;j++)
					if(ch[i]==ch[j]) {
						System.out.println(ch[i]);
						count++;
					break;
					}
				}
				System.out.println(count);
			}

//
//		String a="hhhhhhhha";
//		char[]ch=a.toCharArray();
//		int count=0;
//		for(int i=0;i<ch.length-1;i++)
//		{
//			//for(int j=i+1;j<ch.length;j++) {
//				if(i==ch.length-1) {
//			System.out.println(ch[i]);
//			}
//		}
		//System.out.println(count);
	}

