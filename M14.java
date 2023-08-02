package serilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class M14 {


public static void main(String[] args) throws IOException  {
	
	FileInputStream fin = new FileInputStream("test1.ser");
	ObjectInputStream out = new ObjectInputStream(fin);
   
	
}
}
