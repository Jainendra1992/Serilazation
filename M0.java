package serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class C implements Serializable
{
  int i	;
}
public class M0 {
public static void main(String[] args)throws IOException {
	C c1  = new C();
	c1.i = 50;
	FileOutputStream fout =  new FileOutputStream("c1.ser");
	ObjectOutputStream out = new ObjectOutputStream(fout);
	out.writeObject(c1);
	out.flush();
	 out.close();
	 fout.close();
	 System.out.println("done");
}
}
