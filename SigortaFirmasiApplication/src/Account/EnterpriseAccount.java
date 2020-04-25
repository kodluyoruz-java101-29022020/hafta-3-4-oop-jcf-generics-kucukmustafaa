package Account;

import java.util.ArrayList;

import Insurance.Insurance;
import UserInfo.User;

public class EnterpriseAccount extends Account {
	
	public EnterpriseAccount() {
		this.user=new User();
		this.Insurances=new ArrayList<Insurance>();
	}

	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
