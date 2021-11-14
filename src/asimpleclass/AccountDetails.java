package asimpleclass;

import java.util.*;
public class AccountDetails {

	int Account_Number;
	

String Group;
	String Url;

	String Password;
	
	 public AccountDetails(int Account_Number, String Url, String Group, String Password) {
		super();
		this.Account_Number = Account_Number;
		this.Url = Url;
		this.Group = Group;
		this.Password = Password;
	}

	public AccountDetails() {
		// TODO Auto-generated constructor stub
	}

	public int getAccount_Number() {
		return Account_Number;
	}



	public void setAccount_Number(int account_Number) {
		Account_Number = account_Number;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	public String getGroup() {
		return Group;
	}

	public void setGroup(String group) {
		Group = group;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "AccountDetails [Account_Number=" + Account_Number + ", Url=" + Url + ", Group=" + Group + ", Password="
				+ Password + "]";
	}
	
	
	

}
