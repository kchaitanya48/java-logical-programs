package com.movezero;

public class MoveZeroAtEndOfTheArray {
	
	static void moveZeroAtEndEx1() {

		int[] a= {8,4,0,2,5,0,1,0,9,0,7};
		int[] b=new int[a.length];
		
		int countZero=0;
		int bOffSet=0;
		for(int ab:a) {
			if(ab==0) {
				countZero++;
			}
		}
		
		for(int ab:a) {
			if(ab!=0) {
				b[bOffSet++]=ab;
			}
		}
		
		while(countZero!=0){
			b[bOffSet++]=0;
			countZero--;
		}
		
		for(int ab:b) {
			System.out.print(ab+" ");
		}
	
	}
	
	public static void main(String[] args) {
		moveZeroAtEndEx1();
	}

}
