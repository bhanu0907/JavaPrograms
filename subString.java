package program;

public class subString {
	public static void main(String[] args) {
				String sub="abbc";
				for(int i=0;i<sub.length();i++) {
					for(int j=i+1;j<sub.length()+1;j++) {
						System.out.println(sub.substring(i, j));
					}
				}
//		String sub="abbc";
//		System.out.println(findSub(sub));
//	}
//	public static String findSub(String sub) {
//		String result="";
//		for(int i=0;i<sub.length()-1;i++) {
//			for(int j=1;j<sub.length();j++) {
//
//				 result= sub.substring(i, j);
//				//return result;
//			} 
//			//return result;
//		}
//		return result;
	}
}
