package chainOfResponsibility.middlewares;

public class CheckPermissionMiddleware extends Middleware{

	@Override
	public boolean check(String email, String password) {
		
		if(email.equals("antonia@pires.com")) {
			System.out.print("Bem vinda Admin!");
			return true;
		}
		System.out.print("Bem vinda!");
		
		return checkNext(email, password);
	}

}
