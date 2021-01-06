/*
PROBLEM STATEMENT-

In the bubbleSort.java program (Listing 3.1) and the BubbleSort Workshop
applet, the in index always goes from left to right, finding the largest item and
carrying it toward out on the right. Modify the bubbleSort() method so that it’s
bidirectional. This means the in index will first carry the largest item from left
to right as before, but when it reaches out, it will reverse and carry the smallest
item from right to left. You’ll need two outer indexes, one on the right (the old
out) and another on the left.
*/



import java.util.*;
class BubbleModify
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("Enter the elements of array");
		int i,j,temp;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		System.out.println();
		for(j=0;j<n;j++)
		System.out.print(a[j]+" ");
		
		for(i=0;i<n/2;i++)         //Outer loop
		{
			//Move the largest number to rightmost position
			for(j=i;j<n-i-1;j++)
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			//Move the smallest number to leftmost position
			for(j=n-i-2;j>i;j--)
				if(a[j]<a[j-1])
				{
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			System.out.println();
			for(j=0;j<n;j++)
			System.out.print(a[j]+" ");
		}
		
	}
	
}