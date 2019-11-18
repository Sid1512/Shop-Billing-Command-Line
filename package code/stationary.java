package stationary;
import supermart.supermart;
public class stationary implements supermart
{
	String[] stationary = new String[] {"Notebook","Pen","Geometry Box","Notepad","Sketch Book","Sketch pens"};
	int[] Price = new int[] {50,35,150,75,85,100};
	public String get_item(int x)
	{
		return stationary[x];
	}
	public int get_price(int x)
	{
		return Price[x];
	}
}