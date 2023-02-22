import java.util.*;
public class Binarysearch
{
	//first of all we need to sort the array in asscending order after that we can perform Binary search//
	public void binarysearch(int arr[],int roll,int l)
	{
		int temp=0;
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int start=0;
		int end=arr.length-1;
		int mid=(start+end)/2;
		int count=0;
		while(start<end)
		{
			if(roll<arr[mid])
			{
				end=mid-1;
			}
			else if(roll>arr[mid])
			{
				start=mid+1;
			}
			mid=(start+end)/2;
			if(roll==arr[mid])
			{
				System.out.println(roll+" came to the PAT");
				count++;
				break;
			}
		}	
		if(count==0)
		{
			System.out.println(roll+" didn't attend to PAT");
		}
	}
	public static void main(String args[])
	{
		Binarysearch b=new Binarysearch();
		try (Scanner s = new Scanner(System.in)) 
		{
			System.out.println("Enter the length of array:");
			int l=s.nextInt();
			int arr[]=new int[l];
			System.out.println("Enter roll numbers of attended students:");
			for(int i=0;i<l;i++)
			{
				arr[i]=s.nextInt();
			}
			System.out.println("Enter roll nor you want to search:");
			int roll=s.nextInt();
			b.binarysearch(arr,roll,l);
		}
	}
}