package serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Z implements Serializable
{
    int i ; 
    transient int j;
    static int k;
}
public class M13 {
public static void main(String[] args)throws IOException {
	 Z obj = new Z();
	 obj.i = 10;
	 obj.j = 20;
	 obj.k = 30;
	 // serialize obj
	 FileOutputStream fout = new FileOutputStream("test1.ser");
	 ObjectOutputStream out = new ObjectOutputStream(fout);
	 out.writeObject(obj); 
	 out.flush();
	 out.close();
	 fout.close();
	 System.out.println("done");
}
}
// static member are not object member state member not avialbe inside object
// inside obj no static member
// static member are not serving in the serialization 
// even transient member also not servaing in the serialization 
// transient keyword used avoiding member
// transient member are not evolving in the  serialization
// 