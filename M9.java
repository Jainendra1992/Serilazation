package serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class P implements Serializable
{
  int i;	
}
class Q extends P
{
    int j;	
}
public class M9 {
 public static void main(String[] args) throws IOException{
	Q q1 = new Q();
	q1.i = 20;
	q1.j = 40;
	FileOutputStream fout = new FileOutputStream("test2.ser");
	ObjectOutputStream out = new ObjectOutputStream(fout);
	 out.writeObject(q1);
	 out.flush();
	 out.close();
	 fout.close();
	 System.out.println("done");
	
}
}
