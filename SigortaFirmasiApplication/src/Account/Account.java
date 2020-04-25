package Account;

import java.util.List;

import Auth.AuthenticationStatus;
import Insurance.Insurance;
import UserInfo.User;

public abstract class Account implements Comparable<Account>{
	public User user;
	public List<Insurance> Insurances ;
	public AuthenticationStatus loginStatus ;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Insurance> getInsurances() {
		return Insurances;
	}
	public void setInsurances(List<Insurance> insurances) {
		Insurances = insurances;
	}
	public AuthenticationStatus getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(AuthenticationStatus loginStatus) {
		this.loginStatus = loginStatus;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Insurances == null) ? 0 : Insurances.hashCode());
		result = prime * result + ((loginStatus == null) ? 0 : loginStatus.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (Insurances == null) {
			if (other.Insurances != null)
				return false;
		} else if (!Insurances.equals(other.Insurances))
			return false;
		if (loginStatus != other.loginStatus)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	
	
	public final void showUserInfo() {
		
	}
	
}
