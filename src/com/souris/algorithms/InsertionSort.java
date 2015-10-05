package com.souris.algorithms;

public class InsertionSort implements ISortingAlgorithm {

	@Override
	public int[] sort(int[] a) {
		for(int i=0;i<a.length;i++){
			int temp = a[i];
			int j;
			for(j=i-1;j>=0&& a[j]>temp;j--){
				a[j+1] = a[j];
			}
			a[j+1] = temp;
		}
		return a;
	}

}
