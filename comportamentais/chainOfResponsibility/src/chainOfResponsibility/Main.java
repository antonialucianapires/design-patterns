package chainOfResponsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import chainOfResponsibility.middlewares.CheckPermissionMiddleware;
import chainOfResponsibility.middlewares.CheckUserMiddleware;
import chainOfResponsibility.middlewares.Middleware;
import chainOfResponsibility.server.Server;

public class Main {
	
	private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	private static Server server;
	
	public static void init() {
		server = new Server();
		server.registerUser("antonia@pires.com", "1234");
		server.registerUser("user@pires.com", "4321");
		
		Middleware middleare = new CheckUserMiddleware(server);
		middleare.linkWith(new CheckPermissionMiddleware());
		
		server.setMiddleware(middleare);
	}

	public static void main(String[] args) throws IOException {
		init();
		
		boolean done;
		
		do {
			System.out.println("Digite o -email");
			String email = reader.readLine();
			System.out.println("Digite o -email");
			String password = reader.readLine();
			done = server.login(email, password);
			
		} while(!done);

	}

}
