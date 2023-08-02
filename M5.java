package serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class D implements Serializable
{
  int i, j , k;	
}
public class M5 {
public static void main(String[] args)throws IOException {
	  D d1  = new D();
	    d1 .i = 50;
	    d1 .j = 20;
	    d1 .k = 30;
	    FileOutputStream fout = new FileOutputStream("d1.ser");
	    ObjectOutputStream out = new ObjectOutputStream(fout);
	    out.writeObject(d1);
	    out.writeObject(d1);
	    out.writeObject(d1);
	    out.flush();
	    out.close();
	    fout.close();
	    System.out.println("done");
	    
}
}
