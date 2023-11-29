package program;

import java.util.Arrays;

public class ConvertLowerToUpper {

	public static void main(String[] args) {
		String name="bhanu";
		int size=name.length();
		char []ch=name.toCharArray();
		for(int i=0;i<size;i++) {
			//	char ch=name.charAt(i);
			if(ch[i]>='a' && ch[i]<='z') {/
				ch[i]=(char) (ch[i]='a'+'A');
				
			}
			System.out.println(ch[i]);
		}	
//		String  result =new String(ch);
	//
			
		}
	}
}
