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

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream	is = new InputStream() {	// 	/dev/null
						@Override
						public int read() throws IOException {
							return -1;	
						}
					};
		OutputStream	os = new OutputStream() {	// 	/dev/null
							@Override
							public void write(int b) throws IOException {
							}
					};
					// Throwable->Exception->IOException	FileNotFoundException
		// final OutputStream	os1 = new ByteArrayOutputStream()
		try(final Duration		d = new Duration(); 
			final OutputStream	os1 = new FileOutputStream("d:/x.txt");//new ByteArrayOutputStream();
			final Writer		wr = new OutputStreamWriter(os1)) {	
				// java.lang.AutoCloseable -> java.io.Closeable
			
//			os1.write("test string".getBytes("UTF-8"));
//			os1.flush();
			wr.write("test string");
			wr.flush();
			
			try(final InputStream	is1 = new FileInputStream("d:/x.txt");//new ByteArrayInputStream(((ByteArrayOutputStream)os1).toByteArray());
				final Reader		rdr = new InputStreamReader(is1);
				final BufferedReader	brdr = new BufferedReader(rdr)) {
//				byte[]	buffer = new byte[100];
//				int		readed;
//				
//				while ((readed = is1.read(buffer)) >= 0) {
//					System.err.println("Readed: "+new String(buffer,0,readed,"UTF-8"));
//				}
//				char[]	buffer = new char[100];
//				int		readed;
//				
//				while ((readed = rdr.read(buffer)) >= 0) {
//					System.err.println("Readed: "+new String(buffer,0,readed));
//				}
				String	line;
				
				while ((line = brdr.readLine()) != null) {
					System.err.println("Line="+line);
				}
			}
		}
		// finally {
		//	  os1.close();
		//	  d.close();
		//	}
	}
}


class Duration implements AutoCloseable {
	private final long	startTime = System.currentTimeMillis();

	@Override
	public void close() throws RuntimeException {
		System.err.println("Duration="+(System.currentTimeMillis()-startTime));
	}
}