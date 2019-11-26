package homedecor;
import supermart.supermart;
public class homedecor implements supermart
{
	String[] Homedecor = new String[] {"Bedsheet","Showpiece","Curtain","Candle","Vase","Lamp"};
	int[] Price = new int[] {600,180,400,100,1800,500};
	public String get_item(int x)
	{
		return Homedecor[x];
	}
	public int get_price(int x)
	{
		return Price[x];
	}
}