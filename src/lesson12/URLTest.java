package lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL	url = new URL("http://mail.ru");
		HttpURLConnection	conn = (HttpURLConnection)url.openConnection();

		conn.setRequestMethod("POST");
		conn.setRequestProperty("mmm","sdkjdlfklsdjf");
		conn.connect();
		try(final InputStream		is = conn.getInputStream();
			final Reader			rdr = new InputStreamReader(is);
			final BufferedReader	brdr = new BufferedReader(rdr)) {
		
			String	s;
			while ((s = brdr.readLine()) != null) {
				System.err.println(s);
			}
			System.err.println("Response="+conn.getResponseCode());
		} finally {
			conn.disconnect();
		}

		// https://docs.oracle.com/javase/8/docs/jre/api/net/httpserver/spec/com/sun/net/httpserver/HttpServer.html
		
//		try(final InputStream		is = url.openStream();
//			final Reader			rdr = new InputStreamReader(is);
//			final BufferedReader	brdr = new BufferedReader(rdr)) {
//
//			String	s;
//			while ((s = brdr.readLine()) != null) {
//				System.err.println(s);
//			}
//		}
	}

}
