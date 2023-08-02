package serilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class M6 {
public static void main(String[] args)throws IOException , ClassNotFoundException
{
	FileInputStream fin = new FileInputStream("d1.ser");
	ObjectInputStream in = new ObjectInputStream(fin);
	D d1 = (D) in.readObject();
	System.out.println(d1.i);
	System.out.println(d1.j);
	System.out.println(d1.k);
}
}
