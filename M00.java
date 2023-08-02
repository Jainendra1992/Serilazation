package serilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class M00 {
public static void main(String[] args) throws IOException,ClassNotFoundException
{
	FileInputStream fin = new FileInputStream("c1.ser");
	ObjectInputStream in = new ObjectInputStream(fin);
	C c1 = (C) in.readObject();
	System.out.println(c1.i);
	
}
}
