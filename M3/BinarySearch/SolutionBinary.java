import java.util.Arrays;
import java.util.Scanner;

public class SolutionBinary {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Binary b = new Binary();
		
		
		b.binarySearch();
	}

}

class Binary
{
	Scanner sc = new Scanner(System.in);
	public void binarySearch()
	{
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter array elements:");
		for(int i=0;i<size;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter number:");
		int number = sc.nextInt();
		
		Arrays.sort(a);
		System.out.println("Sorted Order:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]+" ");
		}
		
		int start = 0;
		int end = a.length-1;
		int mid = (start + end)/2;
		
		while( start <= end )
	      {
	         if ( a[mid] < number )
	         {
	        	 start = mid + 1;
	         }
	         else if ( a[mid] == number )
	         {
	        	 if(a[mid]==number && a[mid-1]==number)
	        	 {
	        		 System.out.println("\n"+number +" found at location "+(mid-1));
	        		 break;
	        	 }
	        	 else
	        	 {
	        		 System.out.println("\n"+number +" found at location "+(mid));
	        		 break;
	        	 }
	         }
	         else
	         {
	        	 end = mid - 1;
	         }
	         mid = (start + end)/2;
	      }
	      if ( start > end )
	      {
	          System.out.println(number +" is not found.\n");
	      }
	   }
}
	