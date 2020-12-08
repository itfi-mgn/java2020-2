package lesson11;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class SerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		try(final ByteArrayOutputStream	baos = new ByteArrayOutputStream();
			final ObjectOutputStream	dos = new ObjectOutputStream(baos)) {
			
			dos.writeBoolean(true);
			dos.writeInt(12345);
			dos.writeDouble(6.78);
			dos.writeChar('@');
			dos.writeUTF("test string");
			dos.writeObject(new int[] {2,3,6,-4});
			Test	x = new Test();
			
			dos.writeObject(x);
			dos.reset();
			dos.writeObject(x);
			dos.flush();
			
			System.err.println("Content: "+baos.toString());
			
			try(final ByteArrayInputStream	bais = new ByteArrayInputStream(baos.toByteArray());
				final ObjectInputStream		dis = new ObjectInputStream(bais)) {
				
				System.err.println("Boolean: "+dis.readBoolean());
				System.err.println("Int: "+dis.readInt());
				System.err.println("Double: "+dis.readDouble());
				System.err.println("char: "+dis.readChar());
				System.err.println("String: "+dis.readUTF());
				System.err.println("Object: "+Arrays.toString((int[])dis.readObject()));

				Test a = (Test)dis.readObject(), b = (Test)dis.readObject(); 
				
				System.err.println("Test object: "+a+" and "+(a == b));
			}
		}
	}
}

class Test implements Serializable {
	private static final long serialVersionUID = -1811600713933394735L;
	
//	Test(int x) {
//		System.err.println("Test created");
//	}
	
	int	x = 10;
	double y = 1.2;
	String z = "test string 2";
	transient Object t = new Object();
	
	@Override
	public String toString() {
		return "Test [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
}

