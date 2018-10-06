

import java.util.Scanner;

public class Solution {
	private int[] s;
	private int top=-1;
    int m;
	public Solution(int max)
	{
	  m=max;
		s=new int[max];
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public boolean isFull()
	{
		if(top==m)
		{
			return true;
		}
		else return false;
	}
	public void push(int item)
	{
		if(!isFull())
		{
		s[++top]=item;
		}
		else
		{
			System.out.println("full");
		}
	}
	public int pop()
	{
		if(!isEmpty())
		{
		return s[top--];
		}
		else
			return 0;
	}

public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
    String a =s.nextLine() ;
    int n=a.length();
    String d[]= a.split(" ");
    int n3=0;
	Solution st=new Solution(n);
	for(int i = 0;i<d.length;i++)
	{
	if(d[i].equals("*"))
	{
		int o1=st.pop();
		int o2=st.pop();
		n3=o1*o2;
		st.push(n3);

	}
	else if(d[i].equals("+"))
	{
		int o1=st.pop();
		int o2=st.pop();
		n3=o1+o2;
		st.push(n3);
	}
	else if(d[i].equals("-"))
	{
		int o1=st.pop();
		int o2=st.pop();
		n3=o1-o2;
		st.push(n3);
	}
	else
	{
	    int k=Integer.parseInt(d[i]);
		st.push(k);
	}
	}

	System.out.println(st.pop());
}
}
