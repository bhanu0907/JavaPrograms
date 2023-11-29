package program;

import java.util.Arrays;

public class InterChangeTheRows {

	public static void main(String[] args) {
		
		int mat[][]= {
				{2,1,4},
				{1,2,3},
				{3,6,2}
		};
		interchangeTwoArray(mat);
	}
	public static void interchangeTwoArray(int mat[]  v v) {
		int temp[]=mat[0];
		mat[0]=mat[1];
		mat[1]=temp;
//		int [][]newMat=new int[mat.length][];
//		for(int i=0;i<mat.length;i++) {
//			newMat[i]=new int[mat[i].length];
//			for(int j=0;j<mat[i].length;j++) {
//				newMat[i][j]=mat[i][j];
			
		
		for(int i=0;i<mat.length;i++) {
			System.out.println(Arrays.toString(mat[i]));
			
		}
	}

}
