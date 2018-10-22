import java.util.*;
import java.io.*;
class Team
{
	String tm;
	int wins;
	int losses;
	int draws;
	Team(String tm,int wins,int looses,int draws)
	{
		this.tm=tm;
		this.wins=wins;
		this.losses=losses;
		this.draws=draws;
	}
}
public class Solution
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList();
		while(sc.hasNextLine())
		{
			String m=sc.nextLine();
			String []b=m.split(",");
			Team t=new Team(b[0],Integer.parseInt(b[1]),Integer.parseInt(b[2]),Integer.parseInt(b[3]));
			al.add(t);
			for(int i=0;i<al.size()-1;i++)
			{
				 int min = i;
			      for (int j= i+1; j < al.size(); j++)
			    	  if (compare(al.get(j),al.get(min))) 
			    		  min=j;
			      Team temp=(Team) al.get(i);
			      al.set(i, al.get(min));
			      al.set(min, temp);
			      }
			   Iterator itr1=al.iterator();
			   while(itr1.hasNext())
			   {
				   Team t1=(Team) itr1.next();
				   System.out.println(t1.tm+",");
			}
		}
		
	}
	class WinCamparator implements Comparator
	{
	public int compare(Object a,Object b)
	   {
		 Team t1=(Team)a;
		 Team t2=(Team)b;
		   if(t1.wins==t2.wins)
		   {
			   if(t1.losses==t2.losses)
			   {
				   if(t1.draws>t2.draws)
				   {
					   return 0;
				   }
				   else 
					   return 1;
				   
			   }
			   else if(t1.losses<t2.losses)
			   {
				   return 0;
			   }
			   else
				   return 1;
		   }
		    if(t1.wins>t2.wins)
		   {
			   return 0;
		   }
		   else
			   return 1;
	   }
}
}
