package getdt;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class getdt
{
	public String GetDate(String date)
	{
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("E dd/MM/yy");
		date = df.format(d);
		return date;
	}
	public String GetTime(String time)
	{
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		time = df.format(d);
		return time;
	}
}