package Model;

public class User {
	  private String name;
	  private String eMail;
	  private String userName;
	  private String pasword;
	  
	public User(String name, String eMail, String userName, String pasword) {
		this.name = name;
		this.eMail = eMail;
		this.userName = userName;
		this.pasword = pasword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	  
	  
}
