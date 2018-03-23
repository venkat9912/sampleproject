package myprojects;

public class encapsulation {
	private String username;
	private String password;
    private int id;
    
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    
	public static void main(String[] args) {
		
		encapsulation e=new encapsulation();
		e.setUsername("kishore");
		e.setPassword("kishore");
		e.setId(123);
		System.out.println(e.getUsername());
		System.out.println(e.getPassword());
		System.out.println(e.getId());
		encap.show(e);
		
	}
    
}
