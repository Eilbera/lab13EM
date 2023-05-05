package space;

import java.util.ArrayList;


public class Mission implements Comparable<Mission>
{
	private String			destination;
	private float			cost;
	
	
	public Mission(String destination, Float cost)
	{
		this.destination = destination;
		this.cost = cost;
	}
	
	
	public String getDestination()
	{
		return destination;
	}
	
	
	public float getCost()
	{
		return cost;
	}


	// Compare by cost, then by destination.
	public int compareTo(Mission that) 
	{ 		
		int costcomparison =  Float.compare(this.cost,that.cost);
		if (costcomparison != 0) {
			return costcomparison;
		}
		int destincompare = this.destination.compareTo(that.destination);
		if (destincompare > 0) {
			return 1;
		}
		else if (destincompare < 0) {
			return -1;
		} else {
			return 0;
		}
		
	}
		
	
	
	
	// Let compareTo() do the work. This method should just be 1 line.
	public boolean equals(Object x)
	{
		if(this.compareTo((Mission) x) == 0) {
			return true;
		} return false;
	}
	
	
	// Return the destination’s hash code.
	public int hashCode()
	{
		return this.destination.hashCode();
	}
	
	
	public String toString()
	{
		return "Mission to " + destination + " will cost " + cost;
	}
	
	
	public static void main(String[] args)
	{
		Mission or = new Mission("hello", 19.2f);
		Mission ga = new Mission("jjj", 19.2f);

		System.out.print(or.compareTo(ga));

	}

	}




