import java.io.*;
class Merge_Sort
{
	public static void main(String args[]) throws Exception
	{
		DataInputStream br =new DataInputStream(System.in);
		int i,j;
		System.out.println("Enter the length of the array");
		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[15];
		System.out.println("Enter the elements in the array");
		for(i=0;i<n;i++)
		arr[i]=Integer.parseInt(br.readLine());
		mergeSort(arr,0,n-1);
		printArray(arr,0,n-1);
	}
	static void mergeSort(int arr[],int l,int r)
	{
		if(l!=r)
		{
			int m=(l+r)/2;
			mergeSort(arr,l,m);
			mergeSort(arr,m+1,r);
			printArray(arr,l,r);
			merge(arr,l,m,r);
			printArray(arr,l,r);
		}
		else{
		printArray(arr,l,r);	
		}
	}
	
	static void merge(int arr[],int l,int m,int r)
	{
		int i=l,j=m+1,k=0;
		int a[]=new int[r-l+1];
		while(i<=m && j<=r)
		{
			if(arr[i]<arr[j])
			a[k++]=arr[i++];
			else
			a[k++]=arr[j++];
		}
		if(i>m)
		{
			while(j<=r)
			a[k++]=arr[j++];
		}
		else if(j>r)
		{
			while(i<=m)
			a[k++]=arr[i++];
		}
		for(i=l;i<=r;i++)
		arr[i]=a[i-l];
	}
	static void printArray(int arr[],int l,int r)
	{
		int i;
		System.out.println();
		for(i=l;i<=r;i++)
		System.out.print(arr[i]+"   ");
	}
}