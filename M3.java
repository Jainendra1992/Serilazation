package serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class B implements Serializable
{
	int i;
	int j;
	
}
public class M3 {
public static void main(String[] args)throws IOException{
	B b1 = new B();
	b1.i = 20;
	b1.j = 30; 
	 FileOutputStream fout = new FileOutputStream("b1.ser");
	 ObjectOutputStream out = new ObjectOutputStream(fout);
	 out.writeObject(b1);
	 out.writeObject(b1);
	 out.flush();
	 out.close();
	 fout.close();
	 System.out.println("done");
}
}
