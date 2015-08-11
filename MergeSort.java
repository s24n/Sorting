import java.util.Arrays;
class MergeSort{

public static void mergeSort(int A[],int low,int high)
{
	if(low<high)
	{	
	int mid=(low+high)/2;
	mergeSort(A,low,mid);
	mergeSort(A,mid+1,high);
	merge(A,low,mid,high);	
	}	
	
}

public static void merge(int A[],int low,int mid,int high)
{
	int n1=mid-low+1;
	int n2=high-mid;
	
	int L[]=new int[n1];
	int R[]=new int[n2];
	
	for(int i=0;i<n1;i++)
	{
	L[i]=A[low+i];
	}
	
	for(int i=0;i<n2;i++)
	{
	R[i]=A[mid+i+1];
	}
//System.out.print(Arrays.toString(L)+" ");
//System.out.print(Arrays.toString(R)+" ");

	int l=0,r=0,k=0;
	while(l<n1 && r<n2 )
	{
		if(L[l]<R[r])
		{
		A[low+k]=L[l];
		l++;
		k++;
		}
		else
		{
		A[low+k]=R[r];
		r++;
		k++;
		}		
	}
	while(l<n1)
	{
	    A[low+k]=L[l];
		l++;
		k++;
	}
	while(r<n2)
	{
	    A[low+k]=R[r];
		r++;
		k++;
	}
//System.out.println(Arrays.toString(A));
}



public static void main(String arg[])
{
	int A[]={5,2,1,3,0};
	mergeSort(A,0,4);
	System.out.println(Arrays.toString(A));		
}

}
