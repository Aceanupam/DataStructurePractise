import java.util.*;
class Quick_Sort
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length of array");
		int n=sc.nextInt();
		int arr[]=new int[n+1];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		arr[n]=9999;
		quickSort(arr,0,n);
		printArray(arr,0,n-1);
	}
	static void quickSort(int arr[],int lb,int ub)
	{
		int pi_In=divide(arr,lb,ub);
		if(pi_In-1>lb)
		quickSort(arr,lb,pi_In-1);
		if(pi_In+1<ub)
		quickSort(arr,pi_In+1,ub);
	}
	static int divide(int arr[],int lb,int ub)
	{
		int temp,pivot=arr[lb],pi_In=lb;
		while(ub>lb)
		{
			while(pivot>=arr[lb])
				lb++;
			while(pivot<arr[ub])
				ub--;
			if(ub>lb)
				swap(arr,lb,ub);
		}	
		swap(arr,pi_In,ub);
		return ub;
	}	
	static void swap(int arr[],int pi_In,int ub)
	{
		int temp;
		temp=arr[pi_In];
		arr[pi_In]=arr[ub];
		arr[ub]=temp;
	}
	static void printArray(int arr[],int lb,int ub)
	{
		System.out.println();
		for(int i=lb;i<=ub;i++)
		System.out.print(arr[i]+"  ");
	}
}