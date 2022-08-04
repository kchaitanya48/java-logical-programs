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
	
	//https://www.geeksforgeeks.org/move-zeroes-end-array/
	static void moveZeroAtEndEx2() {
		int[] arr= {8,4,0,2,5,0,1,0,9,0,7};
		int n=arr.length;
		int count = 0;  // Count of non-zero elements
		 
        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; // here count is
                                       // incremented
 
        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < n)
            arr[count++] = 0;
        
        for(int ab:arr) {
			System.out.print(ab+" ");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		moveZeroAtEndEx2();
	}

}
