package com.souris.algorithms;

public class Executer {

	public static void main(String[] args) {
		int[] a = {9,3,6,2,13,0,65,89,99,12,1,78,435,2342343,234324,2342};
		//ISortingAlgorithm sorter = new InsertionSort2();
		//ISortingAlgorithm sorter = new MergeSort2();
		HeapSort sorter = new HeapSort(a);
		//sorter.buildMaxHeap();
		a = sorter.sort();
		//a = sorter.sort(a);
		for(int i:a){
			System.out.println(i);
		}

	}

}
