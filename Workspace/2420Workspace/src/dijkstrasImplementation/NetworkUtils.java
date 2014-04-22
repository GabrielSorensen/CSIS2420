package dijkstrasImplementation;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;

public class NetworkUtils {
	private final String os = System.getProperty("os.name");

	public String traceRoute (InetAddress address) {
		String route = new String();
		try {
			Process traceRT;
			if (os.contains("win") || os.contains("Win")) {
				traceRT = Runtime.getRuntime().exec("tracert " + address.getHostAddress());
			} else {
				traceRT = Runtime.getRuntime().exec("traceroute " + address.getHostAddress());
			}
//			BufferedOutputStream out = (BufferedOutputStream) traceRT.getOutputStream();
			InputStreamReader wr = new InputStreamReader(traceRT.getInputStream());
			
			wr.read(route.toCharArray());
			String errors = "";
			if (errors != "") {
				System.err.println(errors);
			}
		} catch (IOException e) {
			System.err.println("error while preforming tracert:\n" + e);
		}
		return route;
	}
	public String ping (InetAddress address) {
		final int timout = 3000;
		try {
			boolean status = address.isReachable(timout);
			if (status == false) {
				return (address.toString() + " was unreachable.");
			} else {
				return ("ping was successfull @: " + address.toString());
			}
		} catch (IOException ioerr) {
			ioerr.printStackTrace();
		}
		return "Someting went very wrong.";
	}
}
