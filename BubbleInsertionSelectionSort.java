package com.kodnest.arrays.BubbleInsertionSelectionsort;

public class BubbleInsertionSelectionSort
{
	public static int[] bubblesortAsc(int []arr)
	{
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-i-2;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp =arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public static int[] selectionsortAsc(int []arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			int min =arr[i];
			int pos=i;
			for(int j=i+1;j<=arr.length-2;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					pos=j;
				}
			}
			int temp=arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}
	public static int []insertionsortAsc(int []arr)
	{
		for(int i=1;i<=arr.length-2;i++)
		{
			int j=i-1;
			int ele=arr[i];
			while(j>=0&& arr[j]>ele)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=ele;
			
		}
		return arr;
	}
	public static int[] bubblesortDsc(int []arr)
	{
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-i-2;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp =arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public static int[] selectionsortDsc(int []arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			int max =arr[i];
			int pos=i;
			for(int j=i+1;j<=arr.length-2;j++)
			{
				if(arr[j]>max)
				{
					max=arr[j];
					pos=j;
				}
			}
			int temp=arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}
	public static int []insertionsortDsc(int []arr)
	{
		for(int i=1;i<=arr.length-2;i++)
		{
			int j=i-1;
			int ele=arr[i];
			while(j>=0&& arr[j]<ele)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=ele;
			
		}
		return arr;
	}
}
