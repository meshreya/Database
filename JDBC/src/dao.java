
public class dao {
	private int sno;
	private String Name;
	private String Email;
	private String pass;
	
	public dao(int sno, String name, String email, String pass) {
		super();
		this.sno = sno;
		Name = name;
		Email = email;
		this.pass = pass;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	

}
