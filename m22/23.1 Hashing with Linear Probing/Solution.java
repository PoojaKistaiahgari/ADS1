
import java.util.Scanner;
public class Probing<Key,Value> {
int n=0;
int m=10001;
Value[] val=(Value[]) new Object[m];
Key[] keys=(Key[]) new Object[m];
int hash(Key k)
{
	 return k.hashCode() ;
}
void put(Key k,Value v)
{
int i;
for(i=hash(k);keys[i]!=null;i=(i+1)%m)
{
	if(keys[i].equals(k))
	{
	val[i]=v;
	return;
	}
}
    keys[i]=k;
	val[i]=v;
	n++;
}
public int size() {
    return n;
}
public Value get(Key k)
{
	for(int i=hash(k);keys[i]!=null;i=(i+1)%m)
	
		if(k.equals(keys[i]))
			return val[i];
	
	
	return null;
}
public void delete(Key k)
{
	int i=hash(k);
	while(!k.equals(keys))
		i=(i+1)%m;
	keys[i]=null;
	val[i]=null;
	i=(i+1)%m;
	while(keys[i]!=null)
	{
		Key a=keys[i];
		Value b=val[i];
		keys[i]=null;
		val[i]=null;
		n--;
		put(a,b);
		i=(i+1)%m;
	}
	n--;
	if(n>0&&n<=m/8)
		resize(m/2);
	
	
}
private void resize(int c) {
    Probing<Key, Value> temp = new Probing<Key, Value>();

	 for (int i = 0; i < m; i++) {
         if (keys[i] != null) {
             temp.put(keys[i], val[i]);
         }
     }
     keys = temp.keys;
     val= temp.val;
     m    = temp.m;
	
}
void display()
{
for(int i=0;i<n;i++)
{
	System.out.println("{"+keys[i]+":"+val+"}");
}
}
}


public class Solution {
public static void main(String[] args)
{
	Probing p=new Probing();
	Scanner sc=new Scanner(System.in);
	int s=sc.nextInt();
	int c=0;
	while(sc.hasNext())
	{
		
	    String q=sc.nextLine();
	    //System.out.println(q);
	    String a[]=q.split(" ");
		switch(a[0])
		{
		case "put":
			p.put(a[1],Integer.parseInt(a[2]) );
			break;
		case "get":
			
			if( p.get(a[1])==null)
			{
				System.out.println("null");
			}
			else
			{
			System.out.println("{"+a[1]+":"+p.get(a[1])+"}");
			}
			break;
		case "delete":
			p.delete(a[1]);
			break;
		case "display":
			p.display();
			break;
		}
		c++;
	}
}
}
