package m5;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> v=new ArrayList<Integer>();
		int n=sc.nextInt();
		String st[]=new String[n+1];
		for(int i =0;i<n+1;i++)
		{
			st[i]=sc.nextLine();
		}
		String s1[]=new String[2];
		for(int i =1;i<n+1;i++)
		{
			s1=st[i].split(" ");
			int m=Integer.parseInt(s1[0]);
			int m1=Integer.parseInt(s1[1]);
			for(int j = 0;j<m;j++)
			{
				v.add(j);
				
			}
			m1=m1-1;
			int count=0,s2=m1;
			while(count!=m)
			{
				if(s2<v.size())
				{
					if(count<m-1)
					{
					System.out.print(v.remove(s2)+" ");
					}
					else
					{
						System.out.print(v.remove(s2));
					}
					s2=s2+m1;
					count++;
					
				}
				else
				{
					s2=s2-v.size();
				}
				
			}
			System.out.println();
			
			
		}
	
}


}
