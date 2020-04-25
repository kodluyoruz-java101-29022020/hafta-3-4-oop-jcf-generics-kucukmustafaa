package UserInfo;


public class AddressManager {
	public static void HomeAddressAdd(User user,HomeAddress address) 
	{
		user.getHomeAddresses().add(address);
	}
	public static void BusinessAddress(User user,BusinessAddress address)
	{
		user.getBusinessAddresses().add(address);
	}
	
	public static void HomeAddressDelete(User user,HomeAddress address) 
	{
		user.getHomeAddresses().remove(address);
	}
	public static void BusinessAddressDelete(User user,BusinessAddress address) 
	{
		user.getHomeAddresses().remove(address);
	}}
