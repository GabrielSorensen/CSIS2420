package dijkstrasImplementation;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class netTester {
	private static InetAddress localhost;
	private static InetAddress dest1;

	public static void main(String[] args) {
		NetworkUtils n = new NetworkUtils();
		try {
		localhost = InetAddress.getLocalHost();
		dest1 = InetAddress.getByName("10.232.224.63");
		} catch (UnknownHostException e) {
			System.err.println("Something went wrong");
		}
//		System.out.println(n.ping(localhost));
//		System.out.println(n.ping(dest1));
		System.out.println(n.traceRoute(localhost));
//		System.out.println(n.traceRoute(dest1));
	}

}
