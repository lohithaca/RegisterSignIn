package Model;

public class SignInUser {
	private String email;
	private String passward;
	
	public SignInUser(String email, String passward) {
		super();
		this.email = email;
		this.passward = passward;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}
	
	
	
	

}
