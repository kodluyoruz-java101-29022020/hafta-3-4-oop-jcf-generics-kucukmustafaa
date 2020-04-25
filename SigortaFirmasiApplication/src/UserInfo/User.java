package UserInfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class User {
	private String name;
	private String surname;
	private String email;
	private String Sifre;
	private String meslek ;
	private int yas;
	private Date lastLoginDate ;
	
	private List<HomeAddress> homeAddresses=new ArrayList<HomeAddress>(); 
	private List<BusinessAddress> businessAddresses=new ArrayList<BusinessAddress>(); 
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSifre() {
		return Sifre;
	}
	public void setSifre(String sifre) {
		Sifre = sifre;
	}
	public String getMeslek() {
		return meslek;
	}
	public void setMeslek(String meslek) {
		this.meslek = meslek;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	
	
	
	// address ekleme cıkarma methodları
	
	public boolean getHomeAddressesAdd(HomeAddress address) {
		return this.homeAddresses.add(address);
	}
	public void setHomeAddressesRemove(HomeAddress address) {
		this.homeAddresses.remove(address);
	}
	public boolean getBusinessAddressesAdd(BusinessAddress address) {
		return this.businessAddresses.add(address);
	}
	public void setBusinessAddresses(BusinessAddress address) {
		this.businessAddresses.remove(address);
	}
	
	
	
	
	
	
	
	
}
