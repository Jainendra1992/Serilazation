package serilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class M12 {
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		FileInputStream fin = new FileInputStream("test7.ser");
		ObjectInputStream in =  new ObjectInputStream(fin);
		S s1 = (S)in.readObject();
		System.out.println(s1.r1.i);
		System.out.println(s1.j);
		
	}
}
