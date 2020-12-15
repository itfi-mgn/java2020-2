package lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Thread	t = new Thread(()->{
				try(final ServerSocket	ss = new ServerSocket(2000);
					final Socket		sock = ss.accept();
					final InputStream	is = sock.getInputStream();
					final OutputStream	os = sock.getOutputStream();
					final Reader		rdr = new InputStreamReader(is);
					final BufferedReader	brdr = new BufferedReader(rdr);
					final PrintWriter	pw = new PrintWriter(os)) {
					
					System.err.println("Port: "+sock.getLocalPort()+", remote="+sock.getRemoteSocketAddress());
					
					String	s;
					s = brdr.readLine();
					System.err.println(s);
					pw.println("Отстань!");
					pw.flush();
				} catch (IOException exc) {
					exc.printStackTrace();
				}
			});
		t.setDaemon(true);
		t.start();
		
		try(final Socket	sock = new Socket("localhost",2000);
			final InputStream	is = sock.getInputStream();
			final OutputStream	os = sock.getOutputStream();
			final PrintWriter	pw = new PrintWriter(os);
			final Reader		rdr = new InputStreamReader(is);
			final BufferedReader	brdr = new BufferedReader(rdr)) {
			
			System.out.println("Client Port: "+sock.getLocalPort()+", remote="+sock.getRemoteSocketAddress());
			
			pw.println("Превед!");
			pw.flush();
			
			String	s;
			while ((s = brdr.readLine()) != null) {
				System.out.println(s);
			}
		}
	}

}
