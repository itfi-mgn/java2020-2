package lesson9;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class IOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream	is = new InputStream() {	// /dev/null
							@Override
							public int read() throws IOException {
								return -1;
							}
						};
		OutputStream	os = new OutputStream() {	// /dev/null
							@Override
							public void write(int b) throws IOException {
							}
						};

		// final OutputStream	os1 = new ByteArrayOutputStream();
		try(final OutputStream	os1 = new FileOutputStream("d:/abcde.txt");//new ByteArrayOutputStream();
			final OutputStream	os2 = new ByteArrayOutputStream();
			final Writer		wr = new OutputStreamWriter(os1)) {	// try-with-resources
			
//			os1.write("test string".getBytes("UTF-8"));
//			os1.flush();
			wr.write("test string");
			wr.flush();
			
			try(final InputStream	is1 = new FileInputStream("d:/abcde.txt");//new ByteArrayInputStream(((ByteArrayOutputStream)os1).toByteArray());
				final Reader		rdr = new InputStreamReader(is1);
				final BufferedReader	brdr = new BufferedReader(rdr)) {
//				final byte[]		buffer = new byte[100];
//				int					len;
//				
//				while ((len = is1.read(buffer)) >= 0) {
//					System.err.println(new String(buffer,0,len,"UTF-8"));
//				}
//				final char[]		buffer = new char[100];
//				int					len;
//				
//				while ((len = rdr.read(buffer)) >= 0) {
//					System.err.println(new String(buffer,0,len));
//				}
				System.err.println("Line="+brdr.readLine());
			}
			
		} catch (IOException e) {	// Throwable->Exception->IOException  FileNotFoundException
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// finally {
		//    os2.close();
		//    os1.close();
		// }
	}

}
