import java.util.Scanner;

class Book
{
	String Name;
	String Author;
	float price;
	Book(String Name,String Author,float price)
	{
		this.Name=Name;
		this.Author=Author;
		this.price=price;
	}
	@Override
	public String toString() {
		return "Book [Name=" + Name + ", Author=" + Author + ", Price=" + price + "]";
	}
}
class Node
{
	public Book key;
	public int val;
	int data;
	public Node left,right;
	int count;
	Node(Book key,int val)
	{
		this.key=key;
		this.val=val;
	}
}

class BST
{
	Node root;
	int get(Book key)
	{
		Node x=root;
		while(x!=null)
		{
			if(key.Name.compareTo(x.key.Name)<0)
			{
				x=x.left;
			}
			else if(key.Name.compareTo(x.key.Name)>0)
			{
				x=x.right;
			}
			else
			return x.val;
		}
		return 0;
	}
	void put(Book key,int val)
	{
		root=put(root,key,val);
	}
	public Node put(Node x,Book key,int val)
	{
		if(x==null)
		return new Node(key,val);
			//int cmp=compare(key,x.key);
			if(key.Name.compareTo(x.key.Name)<0)
			{
				x.left=put(x.left,key,val);
			}
			else if(key.Name.compareTo(x.key.Name)>0)
			{
				x.right=put(x.right,key,val);
			}
			else if(key.Name.compareTo(x.key.Name)==0)
			{
				x.val=val;
			}
			return x;
		}
	public int size()
	{
		return size(root);
	}
	public int size(Node x)
	{
		if(x==null)
		{
			return 0;
		}
		else return x.count;
	}
	public int rank(Book key)
	{
		return rank(key,root);
	}
	public int rank(Book key,Node x)
	{
		if(x==null)
		{
		return 0;
		}
		else if(key.Name.compareTo(x.key.Name)<0)
		{
		return rank(key,x.left);
		}
		else if(key.Name.compareTo(x.key.Name)>0)
		{
		return rank(key,x.right);
		}
		else if(key.Name.compareTo(x.key.Name)==0)
		{
		return size(x.left);
		}
		return 0;
	}
	public Book floor(Book key)
	{
		Node x=floor(root,key);
		if(x==null)
		{
			return null;
		}
		else return x.key;
	}
	public Node floor(Node x,Book key)
	{
		if(x==null)
		return null;
		else if(key.Name.compareTo(x.key.Name)==0)
			return x;
		else if(key.Name.compareTo(x.key.Name)<0)
		return floor(x.left,key);
			Node t=floor(x.right,key);
			if(t!=null)
				return t;
			else return x;
	}
	public Book ceiling(Book key)
	{
		Node x=ceiling(root,key);
		if(x==null)
		{
			return null;
		}
		else return x.key;
	}
	public Node ceiling(Node x,Book key)
	{
		if(x==null)
			return null;
			else if(key.Name.compareTo(x.key.Name)==0)
				return x;
			else if(key.Name.compareTo(x.key.Name)>0)
			return ceiling(x.right,key);
				Node t=floor(x.left,key);
				if(t!=null)
					return t;
				else return x;
	}
	static int findmax(Node n)
	{
		if(n==null)
			return 0;
		int res=n.data;
		int l=findmax(n.left);
		int r=findmax(n.right);
		if(l>res)
		{
			res=l;
		}
		else if(r>res)
		{
			res=r;
		}
		return res;
	}
	static int findmin(Node n)
	{
		if(n==null)
			return 0;
		int res=n.data;
		int l=findmax(n.left);
		int r=findmax(n.right);
		if(l<res)
		{
			res=l;
		}
		else if(r<res)
		{
			res=r;
		}
		return res;
	}
	
}

public class Solution {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		BST bs=new BST();
		while(sc.hasNext())
		{
			String s=sc.nextLine();
		    String s1[]=s.split(",");
		    String O=s1[0];
		    Book book=new Book(s1[1],s1[2],Float.parseFloat(s1[3]));
		    switch(O)
		    {
		    case "put":
		    	bs.put(book,Integer.parseInt(s1[4]));
		    	break;
		    case "get":
		    	if(bs.get(book)!=0)
		    		System.out.println(bs.get(book));
		    	else
		    		System.out.println("null");
		    	break;
		    case "findmax":
		    	Node n;
				bs.findmax(n);
		    	break;
		    case "findmin":
		    	bs.findmin(n);
		    	break;
		    case "ceiling":
		    	Book key = null;
				bs.ceiling(key);
		    	break;
		    case "floor":
		    	bs.floor(key);
		    case "search":
		    }
		}
	}

}
