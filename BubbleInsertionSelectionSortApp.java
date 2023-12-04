package com.kodnest.arrays.BubbleInsertionSelectionsort;

import java.util.Scanner;

public class BubbleInsertionSelectionSortApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scan.nextInt();
		int []arr = new int[size];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Press 1 to perform bubble sort in ascending order");
		System.out.println("Press 2 to perform selection sort in ascending order");
		System.out.println("Press 3 to perform insertion sort in ascending order");
		System.out.println("Press 4 to perform bubble sort in descending order");
		System.out.println("Press 5 to perform selection sort in descending order");
		System.out.println("Press 6 to perform insertion sort in descending order");
		int number= scan.nextInt();
		System.out.print("Before sorting the elements are : ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		if(number==1)
		{
		int []sortedarray1=BubbleInsertionSelectionSort.bubblesortAsc(arr);
		System.out.print("Bubble sort in Ascending order : ");
		for(int x:sortedarray1)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		}
		BubbleInsertionSelectionSort.bubblesortAsc(arr);
		if(number==2)
		{
		int []sortedarray2=BubbleInsertionSelectionSort.selectionsortAsc(arr);
		System.out.print("Selection sort in Ascending order : ");
		for(int x:sortedarray2)
		{
			System.out.print(x+" ");
		}
		}
		BubbleInsertionSelectionSort.selectionsortAsc(arr);
		if(number==3)
		{
		int []sortedarray3=BubbleInsertionSelectionSort.insertionsortAsc(arr);
		System.out.print("Insertion sort in Ascending order : ");
		for(int x:sortedarray3)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		}
		BubbleInsertionSelectionSort.insertionsortAsc(arr);
		if(number==4)
		{
		int []sortedarray4=BubbleInsertionSelectionSort.bubblesortDsc(arr);
		System.out.print("Bubble sort in Descending order : ");
		for(int x:sortedarray4)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		}
		BubbleInsertionSelectionSort.bubblesortDsc(arr);
		if(number==5)
		{
		int []sortedarray5=BubbleInsertionSelectionSort.selectionsortDsc(arr);
		System.out.print("Selection sort in Descending order : ");
		for(int x:sortedarray5)
		{
			System.out.print(x+" ");
		}
		}
		BubbleInsertionSelectionSort.selectionsortDsc(arr);
		if(number==6)
		{
		int []sortedarray6=BubbleInsertionSelectionSort.insertionsortDsc(arr);
		System.out.print("Insertion sort in Descending order : ");
		for(int x:sortedarray6)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		}
		BubbleInsertionSelectionSort.insertionsortDsc(arr);
		
	}

}
