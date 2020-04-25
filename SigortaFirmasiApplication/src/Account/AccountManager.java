package Account;

import java.util.Set;
import java.util.TreeSet;

import javax.security.auth.login.AccountNotFoundException;

public class AccountManager{
	
	Set<Account> accounts;
	
	public AccountManager() {
		this.accounts=new TreeSet<Account>();
	}
	
	public void addAccount(Account account)
	{
		this.accounts.add(account);
	}
	
	public void deleteAccount(Account account) throws AccountNotFoundException
	{
		if (accounts.contains(account)) {
			accounts.remove(account);
		}
		else {
			throw new AccountNotFoundException("Account bulunamadı");
		}
	}
	
}
