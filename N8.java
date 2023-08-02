package serilization;

import java.io.FileInputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.ObjectInputStream;

public class N8 {
public static void main(String[] args)throws IOException , ClassNotFoundException {
	FileInputStream fin = null;
	ObjectInputStream in = null;
	try
	{
		fin = new FileInputStream("g1.ser");
		in  = new ObjectInputStream(fin);
		G g1 = (G) in.readObject();
		System.out.println(g1.i);
	}
	catch(IOException ex)
	{
		ex.printStackTrace();
	}
	finally
	{
		if(in != null)
			try
		{
				in.close();
				
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		if(fin != null)
			try
		{
				
				
				fin.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
}
// object state into the file system reading object file system ARC
// if super class implementing serializable
