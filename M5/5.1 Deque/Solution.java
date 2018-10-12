

import java.util.Scanner;

class Node1
{
	int data;
	Node1 next;
	Node1(int d)
	{
		this.data=d;
	}
	public String toString() {
		return data +""+next;
	}
}
class LList
{
	Node1 head;
	public LList()
	{
		head=null;
	}
	public void pushEnd(int a)
	{
		Node1 n=new Node1(a);
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node1 temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
		}
		
	}
	public int popEnd()
	{
		Node1 temp1=null;
		if(head==null)
		{
			return 0;
		}
		else if(head.next==null)
		{
			Node1 temp=head;
			head=null;
			return temp.data;
		}
		else
		{
			Node1 temp=head;
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			temp1=temp.next;
			temp.next=null;
			return temp1.data;
		}
	}
	public void display()
	{
		Node1 temp=head;
		if(head==null)
		{
			System.out.println("empty");
		}
		else
		{
			System.out.print("[");
			while(temp!=null)
			{
				System.out.print(temp.data);
				temp=temp.next;
				if(temp!=null)
					System.out.print(",");
			}
			System.out.print("]");
			System.out.println();
		}
	}
	public void pushFront(int a)
	{
		Node1 n=new Node1(a);
		if(head==null)
		{
			head=n;
		}
		else
		{
			n.next=head;
			head=n;
		}
		
	}
	public int popFront()
	{
		if(head==null)
		{
			return 0;
		}
		else
		{
			Node1 temp1=head;
			head=head.next;
			return temp1.data;
		}
	}
	public void pushMiddle(int a)
	{
		int c1=1;
		Node1 n=new Node1(a);
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node1 temp1=head;
			while(c1!=size()/2)
			{
				temp1=temp1.next;
				c1++;
			}
			n.next=temp1.next;
			temp1.next=n;
		}
	}
	public int popMiddle()
	{
		int c=1;
		Node1 temp=head;
		Node1 sec=null;
		while(c!=size()/2)
		{
			sec=temp;
			temp=temp.next;
			c++;
		}
		System.out.println(temp.data);
		temp.next=temp.next.next;
		return temp.data;
	}
	public int size()
	{
		Node1 temp1=head;
		int count=0;
		while(temp1!=null)
		{
			temp1=temp1.next;
			count++;
		}
		return count;
	}
	public String toString() 
	{
		Node1 temp=head;
		return head+"";
	}
}
public class Solution {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String st[]=new String[n+1];
		int i;
		for(i=0;i<n+1;)
		{
			st[i]=sc.nextLine();
			i++;
		}
		String st1[]=new String[2];
		LList l=new LList();
		int count=0;
		for(i=0;i<(st.length);i++)
		{
			st1=st[i].split(" ");
			switch(st1[0])
			{
			case "pushLeft":
				l.pushFront(Integer.parseInt(st1[1]));
				l.display();
				break;
			case "pushRight":
				l.pushEnd(Integer.parseInt(st1[1]));
				//System.out.print("[");
				l.display();
				//System.out.print("]");
				break;
			case "popLeft":l.popFront();
			               l.display();
			               //System.out.print("]");
			               break;
			case "popRight":l.popEnd();
			                //System.out.print("[");
			                l.display();
			               // System.out.print("]");
			                //System.out.println(" ");
			                break;
			case "size":System.out.println(l.size());
			            break;
			default:break;
			
			}
		}
	}

}
