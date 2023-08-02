package serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class R implements Serializable 
{
  int i;	
}
class S implements Serializable
{
  int j;
  R r1;
}
public class M11 {
public static void main(String[] args) throws IOException,ClassNotFoundException{
	R obj = new R();
	obj.i  = 10;
	
	S s1 = new S();
	s1.j = 20; 
	s1.r1 = obj;
	// serialize s1
	FileOutputStream fout = new FileOutputStream("test7.ser");
	ObjectOutputStream out = new ObjectOutputStream(fout);
	out.writeObject(s1);
	 out.flush();
	 out.close();
	 fout.close();
	 System.out.println("done");
}
}
