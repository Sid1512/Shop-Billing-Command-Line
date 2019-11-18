package electronics;
import supermart.supermart;
public class electronics implements supermart
{
	String[] elec = new String[] {"Headphones","USB cabel","Mouse","Gamepad","Hard Disk","Bluetooth Speakers"};
	int[] Price = new int[] {1000,200,500,2000,3000,7000};
	public String get_item(int x)
	{
		return elec[x];
	}
	public int get_price(int x)
	{
		return Price[x];
	}
}
