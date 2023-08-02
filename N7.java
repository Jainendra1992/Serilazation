package serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class G implements Serializable
{
    int i ;	
}
public class N7 {
public static void main(String[] args) {
	G g1 = new G();
	g1.i = 100;
	FileOutputStream fout = null;
	ObjectOutputStream out = null;
	try
	{
		fout = new FileOutputStream("g1.ser");
		out = new ObjectOutputStream(fout);
		out.writeObject(g1);
		out.flush();
		 out.close();
		 fout.close();
		 System.out.println("done");
	}
	catch(IOException ex)
	{
		ex.printStackTrace();
	}
	finally 
	{
		if(out !=null)
			try
		{
				out.flush();
				out.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		if(fout !=null)
		try
		{
			fout.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
}
