package electronics;
import supermart.supermart;
public class electronics implements supermart
{
	String[] elec = new String[] {"Headphones","USB cabel","Mouse","Gamepad","Hard Disk","Pen Drive"};
	int[] Price = new int[] {1000,200,500,2000,3000,700};
	public String get_item(int x)
	{
		return elec[x];
	}
	public int get_price(int x)
	{
		return Price[x];
	}
}