package program;

public class DuplictesInMultiArray {
	public static void main(String[] args) {
		int [][] arr1=new int[][]{
			{10,20,3},
			{10,50,40},
			{1,50,70}};
			int [][]arr2=new int[][]{
				{20,30,50},
				{50,60,70}
				,{30,80,70}};
				boolean isFound=false;
				for(int i=0;i<arr1.length;i++) {
					for(int j=0;j<arr1[i].length;j++) {
						int targetElement=arr1[i][j];
					outer :	for(int k=0;k<arr2.length;k++) {
							isFound=false;
							for(int l=0;l<arr2.length;l++) {
								if(arr1[i][j]==arr2[k][l]) {
									System.out.println(targetElement);
									isFound=true;
									break;
								}
							}
							if(isFound)
								break;
						}
					}
				
				}	
	}


}
