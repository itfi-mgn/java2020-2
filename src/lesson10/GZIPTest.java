package lesson10;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GZIPTest {
	public static void main(String[] args) throws IOException {
		byte[] content = null;
		
		try(final OutputStream	baos = new ByteArrayOutputStream()) {
			try(final GZIPOutputStream	gzos = new GZIPOutputStream(baos)) {
		
				gzos.write("test string".getBytes());
				gzos.flush();
	//			gzos.finish();
			}
			
			System.err.println("content="+baos.toString());
			content = ((ByteArrayOutputStream)baos).toByteArray();
			
		}  // finally { gzos.close() }

	
		try(final InputStream	is = new ByteArrayInputStream(content);
			final GZIPInputStream	gzis = new GZIPInputStream(is)) {
			final byte[]	buffer = new byte[100];
			int		len;
			
			while ((len = gzis.read(buffer)) > 0) {
				System.err.println("Content: "+new String(buffer,0,len)+", len="+len);
			}
			
		}
		
	}
}
