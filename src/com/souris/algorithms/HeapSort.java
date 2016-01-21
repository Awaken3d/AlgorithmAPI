package com.souris.algorithms;

public class HeapSort {
	public static int[] a;
	public static int n;
	public HeapSort(int[] a){ this.a = a;HeapSort.n = a.length-1;}
	public int[] sort() {
		int temp;
		
		buildMaxHeap();
		
		for(int i = n;i>=1;i--){
			
			temp = a[i];
			a[i] = a[0];
			a[0] = temp;
			n-=1;
			maxHeapify(0);
		}
		return a;
	}
	
	public static void maxHeapify(int index){
		int largest = index;
		
		if((2*index) <= n && a[largest] < a[(2*index)]) {largest = (2*index);}
		if((2*index)+1 <= n && a[largest] < a[(2*index) +1]) {largest = (2*index)+1;}
		int temp = a[index];
		if(index!=largest){
		a[index] = a[largest];
		a[largest] = temp;
		
		maxHeapify(largest);
		}
		return ;
		
	}
	
	public static void buildMaxHeap(){
		for(int i = (n/2); i>=0;i--){
			maxHeapify( i );
		}
		
		return ;
	}
}
