package file_append;
import java.io.*; 
public class file_append 
{ 
    public static void AppendToFile(String fileName, String name, String s[], int q[],int t[],int count)
    { 
        try 
        {
            String str;
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true)); 
            str = name + " : ";
            out.write(str);
            for(int i = 0;i < count;i++)
            {
                if(i == count-1)
                {
                    str = "[" + s[i] + "," + q[i] + "," + t[i] + "]";
                    out.write(str);
                }
                else
                {
                    str = "[" + s[i] + "," + q[i] + "," + t[i] + "],";
                    out.write(str);
                }
            }
            out.write("\n");
            out.close(); 
        } 
        catch(IOException e) 
        { 
            System.out.println("exception occoured" + e); 
        } 
    }
}