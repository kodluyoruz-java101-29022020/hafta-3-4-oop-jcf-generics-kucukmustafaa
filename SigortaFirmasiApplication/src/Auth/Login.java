package Auth;

import java.util.Scanner;

import Account.Account;
import UserInfo.User;

public class Login {

	private String email;
	private String sifre;


	public AuthenticationStatus LoginValidate(Account account) throws InvalidAuthenticationException
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("email giriniz...: ");
		this.email=scanner.next();
		System.out.print("sifre giriniz...: ");
		this.sifre=scanner.next();
		
		if (this.email.equals(account.user.getEmail()) && this.sifre.equals(account.user.getSifre())) {
			return account.loginStatus = AuthenticationStatus.SUCCESS;

		} else {
			throw new InvalidAuthenticationException("giris bilgileri hatali");
		}

	}

}
