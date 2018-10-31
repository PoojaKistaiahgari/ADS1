import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String[] s2=new String[2];
		String s3[]=new String[(s1.length()/2)];
		s3=s1.split(" ");
		int v[]=new int[s1.length()/2];
		for(int i=0;i<v.length;i++)
		{
			v[i]=i;
		}
		St st=new St();
		st.sort(s3,v);
		Arrays.toString(s3);
		while(sc.hasNext())
		{
			String s4=sc.nextLine();
			s2=s4.split(" ");
			switch(s2[0])
			{
			case "max":break;
			case "floor":break;
			case "rank":break; 
			case "deleteMin":break;
			case "contains":break;
			case "keys":break;
			case "get": break;

			}
		}
	}

}

class St
{
	public void sort(String arr[],int b[])
	{
		int n=arr.length;
		for(int i1=1;i1<n;i1++)
		{
			String key=arr[i1];
			int k1=b[i1];
			int j=i1-1;
			while(j>=0 && arr[j].compareTo(key)>0)
			{
				arr[j+1]=arr[j];
				b[j+1]=b[j];
				j=j-1;
			}
			arr[j+1]=key;
			b[j+1]=k1;
			
		}
	}
}