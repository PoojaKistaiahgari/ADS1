
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
	Solution st=new Solution(n);
	for(int i = 0;i<n;i++)
	{
		char ch =a.charAt(i);
	      if (ch == '(' || ch == '[' || ch == '{')
	        st.push(i);
	      else if (ch == ')'|| ch == ']' || ch == '}')
	      {
	        //nothing to match with
	        /*if(st.isEmpty())
	        {  
	          System.out.println(false);
	        }*/
	        if(st.pop() != ch)
	        { 
	        	//System.out.println(false);
	        } 

	      }            
	    }
	    if (st.isEmpty())
	    {
	    	System.out.println(true);
	    }
	    else
	    {
	    	System.out.println(false);
	    }
	  }
}

