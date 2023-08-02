package serilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class M10 {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream fin = new FileInputStream("test2.ser");
	ObjectInputStream in =  new ObjectInputStream(fin);
	Q q1 = (Q) in.readObject();
	System.out.println(q1.i);
	System.out.println(q1.j);
	
}
}
