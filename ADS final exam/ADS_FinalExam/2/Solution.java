
import java.util.Scanner;

class Studentdata
{
	int roll_number;
	String student_name;
	double total_marks;
	public Studentdata(int roll_number, String student_name, double total_marks) {
		super();
		this.roll_number = roll_number;
		this.student_name = student_name;
		this.total_marks = total_marks;
	}
	
}
class Node
{
	public Studentdata key;
	int value;
	public Node left,right;
	Node(Studentdata key,int v)
	{
		this.key=key;
		this.value=v;
	}
	//String
	
}
class BST
{
	Node root;
	String GE(Studentdata key)
	{
		Node x=root;
		while(x!=null)
		{
		if(key.total_marks>x.key.total_marks)
		{
			return x.key.student_name;
		}
		}
		return null;
	}
	String LE(Studentdata key)
	{
		Node x=root;
		while(x!=null)
		{
		if(key.total_marks<x.key.total_marks)
		{
			return x.key.student_name;
		}
		}
		return null;
	}
}
public class Solution {
	public static void main(String args[])
	{
		Studentdata std[]=new Studentdata[100];
		BST b=new BST();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1;
		for(int i=0;i<n;i++)
		{
			String s=sc.nextLine();
			String a[]=s.split(",");
			System.out.println(a[0]);
			sc.nextLine();
		}
		n1=sc.nextInt();
		for(int j=0;j<n;j++)
		{
			String s1=sc.nextLine();
			String a1[]=s1.split(" ");
			System.out.println(a1[0]);
			switch(a1[0])
			{
			case "BE":
				break;
			case "GE":
				//b.GE(Integer.parseInt(a1[1]));
				break;
			case "LE":break;
			//b.LE(Integer.parseInt(a1[1]));
			
			}
		}
	}

}
