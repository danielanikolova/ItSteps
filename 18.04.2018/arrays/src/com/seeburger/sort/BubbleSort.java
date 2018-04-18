package com.seeburger.sort;

public final class BubbleSort implements Sortable{

	private static BubbleSort instance=null; 
//	protected BubbleSort()
	{}
	
//	public BubbleSort getInstance() 
//	{
//		if(instance==null)
//		{instance=new BubbleSort();}
//	
//	return instance;
//	}
	
	
	public static void sort(int[] arr) {
		
		boolean swaped = true;
		
		while (swaped == true) {
			swaped = false;
			
			for (int i = 1; i < arr.length; i++) {
				if (arr[i]<arr[i-1]) {
					Sortable.swap(arr, i, i-1);
					swaped = true;
				}
			}
			
		}
		
	}
	
	
	
	

}
